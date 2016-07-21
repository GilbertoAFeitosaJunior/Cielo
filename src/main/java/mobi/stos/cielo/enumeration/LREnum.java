package mobi.stos.cielo.enumeration;

public enum LREnum {

    TRANSACAO_AUTORIZADA("00", "Transação autorizada"),
    TRANSACAO_REFERIDA_BANCO_EMISSOR("01", "Transação referida pelo banco emissor"),
    TRANSACAO_NAO_AUTORIZADA("04", "Transação não autorizada"),
    TRANSACAO_NAO_AUTORIZADA_05("05", "Transação não autorizada"),
    TENTE_NOVAMENTE("06", "Tente novamente"),
    CARTAO_COM_RESTRICAO("07", "Cartão com restrição"),
    CODIGO_SEGURANCA_INVALIDO("08", "Código de segurança inválido"),
    TRANSACAO_AUTORIZADA_11("11", "Transação autorizada"),
    VALOR_INVALIDO("13", "Valor inválido"),
    CARTAO_INVALIDO("14", "Cartão inválido"),
    BANCO_EMISSOR_INDISPONIVEL("15", "Banco emissor indisponível"),
    CANCELAMENTO_NAO_EFETUADO("21", "Cancelamento não efetuado"),
    CARTAO_COM_RESTRICAO_41("41", "Cartão com restrição"),
    SALDO_INSUFICIENTE("51", "Saldo insuficiente"),
    CARTAO_VENCIDO("54", "Cartão vencido"),
    TRANSACAO_NAO_PERMITIDA("57", "Transação não permitida"),
    TRANSACAO_NAO_AUTORIZADA_60("60", "Transação não autorizada"),
    TRANSACAO_NAO_AUTORIZADA_62("62", "Transação não autorizada"),
    CARTAO_NAO_FOI_DESBLOQUEADO_PELO_PORTADOR("78", "Cartão não foi desbloqueado pelo portador"),
    ERRO_NO_CARTAO("82", "Erro no cartão"),
    BANCO_FORA_DO_AR("91", "Banco fora do ar"),
    TENTE_NOVAMENTE_96("96", "Tente novamente"),
    TEMPO_EXCEDIDO("AA", "Tempo excedido"),
    USE_FUNCAO_DEBITO("AC", "Use função débito"),
    TRANSACAO_REFERIDA_PELA_CIELO("GA", "Transação referida pela Cielo");

    private final String codigo;
    private final String nomeApresentacao;

    private LREnum(String codigo, String nomeApresentacao) {
        this.codigo = codigo;
        this.nomeApresentacao = nomeApresentacao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNomeApresentacao() {
        return nomeApresentacao;
    }

    public static LREnum valueOfSigla(String codigo) {
        for (LREnum t : values()) {
            if (t.getCodigo().equalsIgnoreCase(codigo)) {
                return t;
            }
        }
        return null;
    }

}
