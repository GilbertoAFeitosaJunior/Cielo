package mobi.stos.cielo;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.TimeZone;
import javax.xml.parsers.ParserConfigurationException;
import mobi.stos.cielo.bean.request.CartaoCredito;
import mobi.stos.cielo.bean.request.Loja;
import mobi.stos.cielo.bean.request.Pedido;
import mobi.stos.cielo.bean.response.Autenticacao;
import mobi.stos.cielo.bean.response.Autorizacao;
import mobi.stos.cielo.bean.response.Captura;
import mobi.stos.cielo.bean.response.Erro;
import mobi.stos.cielo.bean.response.FormaPagamento;
import mobi.stos.cielo.bean.response.Transacao;
import mobi.stos.cielo.enumeration.BandeiraEnum;
import mobi.stos.cielo.enumeration.ErroEnum;
import mobi.stos.cielo.enumeration.IdiomaEnum;
import mobi.stos.cielo.enumeration.LREnum;
import mobi.stos.cielo.enumeration.MoedaEnum;
import mobi.stos.cielo.enumeration.StatusTransacaoEnum;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.xml.sax.SAXException;

public class Checkout {

    private static int turno = 0;

//    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, JDOMException, ParseException {
//
//        Checkout checkout = new Checkout();
//        Object object = checkout.test();
//        if (object != null) {
//            if (object instanceof Transacao) {
//                Transacao transacao = (Transacao) object;
//                System.out.println("TID: " + transacao.getTid());
//                if (transacao.getAutorizacao() != null) {
//                    System.out.println("Autorização: " + transacao.getAutorizacao().getLr().getNomeApresentacao());
//                }
//            } else if (object instanceof Erro) {
//                Erro erro = (Erro) object;
//                System.err.println("Erro: " + erro.getErro() + " | Causa: " + erro.getErro().getDescricao());
//                System.out.println("Mensagem: " + erro.getMensagem());
//            } else {
//                System.out.println("Objeto não recebeu instancia");
//            }
//        } else {
//            System.out.println("Return null");
//        }
//    }

    /**
     * *
     * Função cria Transação Cielo via Cartão de Crédito. Não funcionará via
     * DÉBITO!!!
     *
     * @param cieloRequest
     * @return Object Realizar cast para Transação / Erro
     * @throws IOException
     * @throws JDOMException
     * @throws ParseException
     */
    public Object doCartaoCreditoRequest(CieloRequest cieloRequest) throws IOException, JDOMException, ParseException {
        String content = this.buildTransactionXML(
                cieloRequest.getLoja(),
                cieloRequest.getPedido(),
                cieloRequest.getCartaoCredito(),
                cieloRequest.getUrlRetorno(),
                cieloRequest.getCaminhoArmazenamentoXml()
        );
        return this.sendPOST(content);
    }

    public Object test() throws IOException, JDOMException, ParseException {
        Loja loja = new Loja();
        loja.setChave("0");
        loja.setMerchantId("0");
        loja.setCodigoEstabelecimento(0);

        Pedido pedido = new Pedido();
        pedido.setDataHora(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse("2015-12-22T11:43:37"));
        pedido.setDescricao("Teste");
        pedido.setNumero(1);
        pedido.setIdioma(IdiomaEnum.PT);
        pedido.setMoeda(MoedaEnum.REAL);
        pedido.setParcelas(1);
        pedido.setValor("100");
        pedido.setSubDescricao("teste");

        CartaoCredito cartao = new CartaoCredito();
        cartao.setBandeira(BandeiraEnum.VISA);
        cartao.setNumCartao(4984425424292960l);
        cartao.setCodigoSeguranca(123);
        cartao.setValidade("202011");

        String content = buildTransactionXML(loja, pedido, cartao, "https://avaloa.com.br/", "c:\\temp\\");
        return sendPOST(content);
    }

    private String buildTransactionXML(Loja loja, Pedido pedido, CartaoCredito cartao, String urlRetorno, String outPutPath) {
        try {
            Element requisicaoTransacao = new Element("requisicao-transacao");
            requisicaoTransacao.setAttribute("id", loja.getMerchantId());
            requisicaoTransacao.setAttribute("versao", "1.2.1");

            Document doc = new Document(requisicaoTransacao);

            //<editor-fold defaultstate="collapsed" desc="dados-ec">
            Element dados_ec = new Element("dados-ec");
            dados_ec.addContent(new Element("numero").setText(String.valueOf(loja.getCodigoEstabelecimento())));
            dados_ec.addContent(new Element("chave").setText(loja.getChave()));
            doc.getRootElement().addContent(dados_ec);
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="dados_portador">
            Element dados_portador = new Element("dados-portador");
            dados_portador.addContent(new Element("numero").setText(String.valueOf(cartao.getNumCartao())));
            dados_portador.addContent(new Element("validade").setText(cartao.getValidade()));
            dados_portador.addContent(new Element("indicador").setText("1"));
            dados_portador.addContent(new Element("codigo-seguranca").setText(String.valueOf(cartao.getCodigoSeguranca())));
            doc.getRootElement().addContent(dados_portador);
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="dados_pedido">
            Element dados_pedido = new Element("dados-pedido");
            dados_pedido.addContent(new Element("numero").setText(String.valueOf(pedido.getNumero())));
            dados_pedido.addContent(new Element("valor").setText(pedido.getValor()));
            dados_pedido.addContent(new Element("moeda").setText(pedido.getMoeda().getCodigo()));
            dados_pedido.addContent(new Element("data-hora").setText(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(pedido.getDataHora())));
            dados_pedido.addContent(new Element("descricao").setText(pedido.getDescricao()));
            dados_pedido.addContent(new Element("idioma").setText(pedido.getIdioma().getSigla()));
            dados_pedido.addContent(new Element("soft-descriptor").setText(pedido.getSubDescricao()));
            //dados_pedido.addContent(new Element("taxa-embarque").setText(""));
            doc.getRootElement().addContent(dados_pedido);
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="forma-pagamento">
            Element forma_pagamento = new Element("forma-pagamento");
            forma_pagamento.addContent(new Element("bandeira").setText(cartao.getBandeira().getNomeApresentacao().toLowerCase()));
            forma_pagamento.addContent(new Element("produto").setText(pedido.getParcelas() == 1 ? "1" : "2")); //
            forma_pagamento.addContent(new Element("parcelas").setText(String.valueOf(pedido.getParcelas())));
            doc.getRootElement().addContent(forma_pagamento);
            //</editor-fold>

            doc.getRootElement().addContent(new Element("url-retorno").setText(urlRetorno));
            doc.getRootElement().addContent(new Element("autorizar").setText("3"));
            doc.getRootElement().addContent(new Element("capturar").setText("true"));
            //doc.getRootElement().addContent(new Element("campo-livre").setText("Informações extras"));

            XMLOutputter xmlOutput = new XMLOutputter();
            Format format = Format.getPrettyFormat();
            format.setEncoding("ISO-8859-1");
            format.setIndent("\t");
            xmlOutput.setFormat(format);
            xmlOutput.output(doc, new FileWriter(outPutPath + "requisicao-transacao-" + pedido.getNumero() + ".xml"));
            return xmlOutput.outputString(doc);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro ao criar XML: " + e.getMessage());
            return null;
        }
    }

    private Object sendPOST(String content) throws IOException, JDOMException, ParseException {
        content = "mensagem=" + content;

        turno++;
        System.out.println(turno + "º REQUEST: ");
        System.out.println(content);

        URL obj = new URL("https://ecommerce.cielo.com.br/servicos/ecommwsec.do");
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        con.setRequestProperty("Content-Length", Integer.toString(content.getBytes("UTF-8").length));
        con.setDoOutput(true);
        con.setDoInput(true);

        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(content);
        wr.flush();
        wr.close();

        InputStream is = con.getInputStream();
        BufferedReader rd = new BufferedReader(new InputStreamReader(is));
        String line;
        StringBuilder response = new StringBuilder();
        while ((line = rd.readLine()) != null) {
            response.append(line);
            response.append('\r');
        }
        rd.close();

        System.out.println(turno + "º RESPONSE: ");
        System.out.println(response);

        InputStream stream = new ByteArrayInputStream(response.toString().getBytes("UTF-8"));
        SAXBuilder builder = new SAXBuilder();
        Document doc = builder.build(stream);
        Element classElement = doc.getRootElement();

        switch (classElement.getName()) {
            case "transacao":
                return this.decodeTransacao(classElement);
            case "erro":
                return this.decodeErro(classElement);
        }

        return null;
    }

    private Erro decodeErro(Element classElement) throws ParseException {
        Erro erro = new Erro();

        List<Element> elements = classElement.getChildren();
        for (Element element : elements) {
            switch (element.getName()) {
                case "codigo":
                    erro.setErro(ErroEnum.valueOf(Integer.parseInt(element.getText())));
                    break;
                case "mensagem":
                    erro.setMensagem(element.getText());
                    break;
            }
        }

        return erro;
    }

    private Transacao decodeTransacao(Element classElement) throws ParseException {
        Transacao transacao = new Transacao();
        Captura captura = new Captura();
        Autenticacao autenticacao = new Autenticacao();
        Autorizacao autorizacao = new Autorizacao();
        FormaPagamento formaPagamento = new FormaPagamento();
        Pedido pedido = new Pedido();

        List<Element> list;
        List<Element> elements = classElement.getChildren();
        for (Element element : elements) {
            switch (element.getName()) {
                case "tid":
                    transacao.setTid(element.getText());
                    break;
                case "pan":
                    transacao.setPan(element.getText());
                    break;
                case "status":
                    transacao.setStatus(StatusTransacaoEnum.valueOf(Integer.parseInt(element.getText())));
                    break;
                case "captura":
                    list = element.getChildren();
                    for (Element e : list) {
                        switch (e.getName()) {
                            case "codigo":
                                captura.setCodigo(Integer.parseInt(e.getText()));
                                break;
                            case "mensagem":
                                captura.setMensagem(e.getText());
                                break;
                            case "data-hora":
                                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.sss");
                                sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
                                captura.setDataHora(sdf.parse(e.getText()));
                                break;
                            case "valor":
                                captura.setValor(e.getText());
                                break;
                        }
                    }
                    break;
                case "autenticacao":
                    list = element.getChildren();
                    for (Element e : list) {
                        switch (e.getName()) {
                            case "codigo":
                                autenticacao.setCodigo(Integer.parseInt(e.getText()));
                                break;
                            case "mensagem":
                                autenticacao.setMensagem(e.getText());
                                break;
                            case "data-hora":
                                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.sss");
                                sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
                                autenticacao.setDataHora(sdf.parse(e.getText()));
                                break;
                            case "valor":
                                autenticacao.setValor(e.getText());
                                break;
                            case "eci":
                                autenticacao.setEci(Integer.parseInt(e.getText()));
                                break;
                        }
                    }
                    break;
                case "autorizacao":
                    list = element.getChildren();
                    for (Element e : list) {
                        switch (e.getName()) {
                            case "codigo":
                                autorizacao.setCodigo(Integer.parseInt(e.getText()));
                                break;
                            case "mensagem":
                                autorizacao.setMensagem(e.getText());
                                break;
                            case "data-hora":
                                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.sss");
                                sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
                                autorizacao.setDataHora(sdf.parse(e.getText()));
                                break;
                            case "valor":
                                autorizacao.setValor(e.getText());
                                break;
                            case "lr":
                                autorizacao.setLr(LREnum.valueOfSigla(e.getText()));
                                break;
                            case "arp":
                                autorizacao.setArp(e.getText());
                                break;
                            case "nsu":
                                autorizacao.setNsu(e.getText());
                                break;
                        }
                    }
                    break;
                case "forma-pagamento":
                    list = element.getChildren();
                    for (Element e : list) {
                        switch (e.getName()) {
                            case "bandeira":
                                formaPagamento.setBandeira(BandeiraEnum.valueOfSigla(e.getText()));
                                break;
                            case "produto":
                                formaPagamento.setProduto(Integer.parseInt(e.getText()));
                                break;
                            case "parcelas":
                                formaPagamento.setParcelas(Integer.parseInt(e.getText()));
                                break;
                        }
                    }
                    break;
                case "dados-pedido":
                    list = element.getChildren();
                    for (Element e : list) {
                        switch (e.getName()) {
                            case "numero":
                                pedido.setNumero(Long.parseLong(e.getText()));
                                break;
                            case "valor":
                                pedido.setValor(e.getText());
                                break;
                            case "moeda":
                                pedido.setMoeda(MoedaEnum.valueOfCodigo(e.getText()));
                                break;
                            case "data-hora":
                                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.sss");
                                sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
                                pedido.setDataHora(sdf.parse(e.getText()));
                                break;
                            case "descricao":
                                pedido.setDescricao(e.getText());
                                break;
                            case "idioma":
                                pedido.setIdioma(IdiomaEnum.valueOfSigla(e.getText()));
                                break;
                            case "taxa-embarque":
                                pedido.setTaxaEmbarque(e.getText());
                                break;
                        }
                    }
                    break;
            }
        }

        transacao.setCaptura(captura);
        transacao.setAutenticacao(autenticacao);
        transacao.setAutorizacao(autorizacao);
        transacao.setFormaPagamento(formaPagamento);
        transacao.setPedido(pedido);

        return transacao;
    }

    private String buildQueryXML(String tipo, String tid, Loja loja, Pedido pedido) {
        try {
            Element requisicaoTransacao = new Element(tipo);
            requisicaoTransacao.setAttribute("id", loja.getMerchantId());
            requisicaoTransacao.setAttribute("versao", "1.2.1");
            Document doc = new Document(requisicaoTransacao);

            Element element_tid = new Element("tid").setText(tid);
            doc.getRootElement().addContent(element_tid);

            Element dados_ec = new Element("dados-ec");
            dados_ec.addContent(new Element("numero").setText(String.valueOf(loja.getCodigoEstabelecimento())));
            dados_ec.addContent(new Element("chave").setText(loja.getChave()));
            doc.getRootElement().addContent(dados_ec);
            if (tipo.equals("requisicao-captura")) {
                doc.getRootElement().addContent(new Element("valor").setText(pedido.getValor()));
            }

            XMLOutputter xmlOutput = new XMLOutputter();
            Format format = Format.getPrettyFormat();
            format.setEncoding("ISO-8859-1");
            format.setIndent("\t");
            xmlOutput.setFormat(format);
            xmlOutput.output(doc, new FileWriter("requisicao-consulta.xml"));
            return xmlOutput.outputString(doc);
        } catch (IOException e) {
            System.out.println("Erro ao criar XML: " + e.getMessage());
            return null;
        }
    }

}
