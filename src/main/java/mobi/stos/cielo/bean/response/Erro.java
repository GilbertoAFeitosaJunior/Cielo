package mobi.stos.cielo.bean.response;

import mobi.stos.cielo.enumeration.ErroEnum;

public class Erro {

    private ErroEnum erro;
    private String mensagem;

    public ErroEnum getErro() {
        return erro;
    }

    public void setErro(ErroEnum erro) {
        this.erro = erro;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
