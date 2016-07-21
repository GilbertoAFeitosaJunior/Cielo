package mobi.stos.cielo.bean.response;

import java.util.Date;
import mobi.stos.cielo.enumeration.IdiomaEnum;
import mobi.stos.cielo.enumeration.MoedaEnum;

public class DadosPedido {

    private int numero;
    private String valor;
    private MoedaEnum moeda;
    private Date dataHora;
    private String descricao;
    private IdiomaEnum idioma;
    private int taxaEmbarque;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public MoedaEnum getMoeda() {
        return moeda;
    }

    public void setMoeda(MoedaEnum moeda) {
        this.moeda = moeda;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public IdiomaEnum getIdioma() {
        return idioma;
    }

    public void setIdioma(IdiomaEnum idioma) {
        this.idioma = idioma;
    }

    public int getTaxaEmbarque() {
        return taxaEmbarque;
    }

    public void setTaxaEmbarque(int taxaEmbarque) {
        this.taxaEmbarque = taxaEmbarque;
    }

}
