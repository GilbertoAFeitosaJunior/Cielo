package mobi.stos.cielo.bean.request;

import java.util.Date;
import mobi.stos.cielo.enumeration.IdiomaEnum;
import mobi.stos.cielo.enumeration.MoedaEnum;

public class Pedido {

    private long numero;
    private String valor; // Valor em centavos 
    private String descricao;
    private String subDescricao;
    private IdiomaEnum idioma;
    private MoedaEnum moeda;
    private Date dataHora; // Formato: aaaa-MM-ddTHH24:mm:ss (ex: 2011-12-21T11:32:45) 
    private String taxaEmbarque; // Valor em centavos
    private int parcelas;

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
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

    public String getTaxaEmbarque() {
        return taxaEmbarque;
    }

    public void setTaxaEmbarque(String taxaEmbarque) {
        this.taxaEmbarque = taxaEmbarque;
    }

    public String getSubDescricao() {
        return subDescricao;
    }

    public void setSubDescricao(String subDescricao) {
        this.subDescricao = subDescricao;
    }

}
