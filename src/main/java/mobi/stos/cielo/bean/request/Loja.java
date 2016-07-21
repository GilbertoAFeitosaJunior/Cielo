package mobi.stos.cielo.bean.request;

public class Loja {

    private long id;
    private long codigoEstabelecimento;
    private String merchantId;
    private String chave;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCodigoEstabelecimento() {
        return codigoEstabelecimento;
    }

    public void setCodigoEstabelecimento(long codigoEstabelecimento) {
        this.codigoEstabelecimento = codigoEstabelecimento;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

}
