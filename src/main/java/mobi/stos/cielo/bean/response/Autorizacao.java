package mobi.stos.cielo.bean.response;

import java.util.Date;
import mobi.stos.cielo.enumeration.LREnum;

public class Autorizacao {

    private int codigo;
    private String mensagem;
    private Date dataHora;
    private String valor;
    private LREnum lr;
    private String arp;
    private String nsu;

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

    public LREnum getLr() {
        return lr;
    }

    public void setLr(LREnum lr) {
        this.lr = lr;
    }

    public String getArp() {
        return arp;
    }

    public void setArp(String arp) {
        this.arp = arp;
    }

    public String getNsu() {
        return nsu;
    }

    public void setNsu(String nsu) {
        this.nsu = nsu;
    }

}
