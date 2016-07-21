package mobi.stos.cielo.bean.response;

import mobi.stos.cielo.bean.request.Pedido;
import mobi.stos.cielo.enumeration.StatusTransacaoEnum;

public class Transacao {

    private String tid;
    private String pan;
    private StatusTransacaoEnum status;
    private Captura captura;
    private FormaPagamento formaPagamento;
    private Autenticacao autenticacao;
    private Autorizacao autorizacao;
    private Pedido pedido;

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public Captura getCaptura() {
        return captura;
    }

    public void setCaptura(Captura captura) {
        this.captura = captura;
    }

    public StatusTransacaoEnum getStatus() {
        return status;
    }

    public void setStatus(StatusTransacaoEnum status) {
        this.status = status;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Autenticacao getAutenticacao() {
        return autenticacao;
    }

    public void setAutenticacao(Autenticacao autenticacao) {
        this.autenticacao = autenticacao;
    }

    public Autorizacao getAutorizacao() {
        return autorizacao;
    }

    public void setAutorizacao(Autorizacao autorizacao) {
        this.autorizacao = autorizacao;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

}
