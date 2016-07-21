package mobi.stos.cielo.bean.request;

import mobi.stos.cielo.enumeration.BandeiraEnum;

public class CartaoCredito {

    private BandeiraEnum bandeira;
    private long numCartao;
    private int codigoSeguranca;
    private String validade; // Formato: yyyyMM (ex: 201512)

    public BandeiraEnum getBandeira() {
        return bandeira;
    }

    public void setBandeira(BandeiraEnum bandeira) {
        this.bandeira = bandeira;
    }

    public long getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(long numCartao) {
        this.numCartao = numCartao;
    }

    public int getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public void setCodigoSeguranca(int codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
}
