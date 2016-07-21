package mobi.stos.cielo.enumeration;

public enum StatusTransacaoEnum {

    CRIADA("Transação Criada"),
    EM_ANDAMENTO("Transação em Andamento"),
    AUTENTICADA("Transação Autenticada"),
    NAO_AUTENTICADA("Transação não Autenticada"),
    AUTORIZADA("Transação Autorizada"),
    NAO_AUTORIZADA("Transação não Autorizada"),
    CAPTURADA("Transação Capturada"),
    CANCELADA("Transação Cancelada"),
    EM_AUTENTICACAO("Transação em Autenticação"),
    EM_CANCELAMENTO("Transação em Cancelamento");

    private final String nomeApresentacao;

    private StatusTransacaoEnum(String nomeApresentacao) {
        this.nomeApresentacao = nomeApresentacao;
    }

    public String getNomeApresentacao() {
        return nomeApresentacao;
    }

    public static StatusTransacaoEnum valueOf(int ordinal) {
        for (StatusTransacaoEnum t : values()) {
            if (t.ordinal() == ordinal) {
                return t;
            }
        }
        return null;
    }

}
