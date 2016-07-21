package mobi.stos.cielo;

import mobi.stos.cielo.bean.request.CartaoCredito;
import mobi.stos.cielo.bean.request.Loja;
import mobi.stos.cielo.bean.request.Pedido;

public class CieloRequest {

    private CartaoCredito cartaoCredito;
    private Loja loja;
    private Pedido pedido;
    private String caminhoArmazenamentoXml;
    private String urlRetorno;

    public CartaoCredito getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(CartaoCredito cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public String getCaminhoArmazenamentoXml() {
        return caminhoArmazenamentoXml;
    }

    public void setCaminhoArmazenamentoXml(String caminhoArmazenamentoXml) {
        this.caminhoArmazenamentoXml = caminhoArmazenamentoXml;
    }

    public String getUrlRetorno() {
        return urlRetorno;
    }

    public void setUrlRetorno(String urlRetorno) {
        this.urlRetorno = urlRetorno;
    }

}
