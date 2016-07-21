package mobi.stos.cielo.bean.response;

import java.util.Date;

public class Autenticacao {

    private int codigo;
    private String mensagem;
    private Date dataHora;
    private String valor;
    private int eci;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getEci() {
        return eci;
    }

    public void setEci(int eci) {
        this.eci = eci;
    }

}
