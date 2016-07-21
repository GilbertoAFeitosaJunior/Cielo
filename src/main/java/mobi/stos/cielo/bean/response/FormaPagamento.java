package mobi.stos.cielo.bean.response;

import mobi.stos.cielo.enumeration.BandeiraEnum;

public class FormaPagamento {

    private BandeiraEnum bandeira;
    private int produto;
    private int parcelas;

    public BandeiraEnum getBandeira() {
        return bandeira;
    }

    public void setBandeira(BandeiraEnum bandeira) {
        this.bandeira = bandeira;
    }

    public int getProduto() {
        return produto;
    }

    public void setProduto(int produto) {
        this.produto = produto;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

}
