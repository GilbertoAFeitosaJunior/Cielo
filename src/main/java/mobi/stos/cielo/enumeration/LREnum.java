package mobi.stos.cielo.enumeration;

public enum LREnum {

    TRANSACAO_AUTORIZADA("00", "Transação autorizada com sucesso"),
    TRANSACAO_AUTORIZADA_000("000", "Transação autorizada com sucesso"),
    TRANSACAO_REFERIDA_BANCO_EMISSOR("01", "Transação referida pelo banco emissor"),
    TRANSACAO_NAO_PERMITIDA_03("03", "Transação não permitida. Erro no cadastramento do código do estabelecimento no arquivo de configuração do TEF"),
    TRANSACAO_NAO_AUTORIZADA("04", "Transação não autorizada. Cartão bloqueado pelo banco emissor."),
    TRANSACAO_NAO_AUTORIZADA_05("05", "Transação não autorizada. Cartão inadimplente (Do not honor)."),
    TENTE_NOVAMENTE("06", "Transação não autorizada. Cartão cancelado."),
    CARTAO_COM_RESTRICAO("07", "Transação negada. Reter cartão condição especial"),
    CODIGO_SEGURANCA_INVALIDO("08", "Código de segurança inválido"),
    TRANSACAO_AUTORIZADA_11("11", "Transação autorizada com sucesso para cartão emitido no exterior"),
    TRANSACAO_INVALIDA("12", "Transação inválida, erro no cartão."),
    VALOR_INVALIDO("13", "Valor inválido"),
    CARTAO_INVALIDO("14", "Cartão inválido"),
    BANCO_EMISSOR_INDISPONIVEL("15", "Banco emissor indisponível"),
    REFACA_TRANSACAO("19", "Refaça a transação ou tente novamente mais tarde."),
    CANCELAMENTO_NAO_EFETUADO("21", "Cancelamento não efetuado"),
    PARCELAMENTO_INVALIDO("22", "Parcelamento inválido. Número de parcelas inválidas."),
    TRANSACAO_NAO_AUTORIZADA_23("23", "Transação não autorizada. Valor da prestação inválido."),
    QUANTIDADE_PARCELAS_INVALIDA("24", "Quantidade de parcelas inválido."),
    PEDIDO_AUTORIZACAO_NAO_ENVIOU_CARTAO("25", "Pedido de autorização não enviou número do cartão"),
    ARQUIVO_TEMPORARIAMENTE_INDISPONIVEL("28", "Arquivo temporariamente indisponível."),
    TRANSACAO_NAO_AUTORIZADA_30("30", "Transação não autorizada. Decline Message."),
    TRANSACAO_NAO_AUTORIZADA_39("39", "Transação não autorizada. Erro no banco emissor."),
    CARTAO_COM_RESTRICAO_41("41", "Cartão com restrição"),
    CARTAO_COM_RESTRICAO_43("43", "Transação não autorizada. Cartão bloqueado por roubo."),
    SALDO_INSUFICIENTE("51", "Saldo insuficiente"),
    CARTAO_DIGITO_CONTROLE_INVALIDO("52", "Cartão com dígito de controle inválido."),
    TRANSACAO_NAO_PERMITIDA_53("53", "Transação não permitida. Cartão poupança inválido"),
    CARTAO_VENCIDO("54", "Cartão vencido"),
    SENHA_INVALIDA("55", "Senha inválida"),
    TRANSACAO_NAO_PERMITIDA("57", "Transação não permitida para o cartão"),
    TRANSACAO_NAO_PERMITIDA_58("58", "Transação não permitida. Opção de pagamento inválida."),
    TRANSACAO_NAO_PERMITIDA_59("59", "Transação não autorizada. Suspeita de fraude."),
    TRANSACAO_NAO_AUTORIZADA_60("60", "Transação não autorizada"),
    BANCO_EMISSOR_VISA_INDISPONIVEL("61", "Banco emissor Visa indisponível."),
    TRANSACAO_NAO_AUTORIZADA_62("62", "Transação não autorizada. Cartão restrito para uso doméstico."),
    TRANSACAO_NAO_AUTORIZADA_63("63", "Transação não autorizada. Violação de segurança"),
    TRANSACAO_NAO_AUTORIZADA_64("64", "Transação não autorizada. Valor abaixo do mínimo exigido pelo banco emissor."),
    TRANSACAO_NAO_AUTORIZADA_65("65", "Transação não autorizada. Excedida a quantidade de transações para o cartão."),
    TRANSACAO_NAO_AUTORIZADA_67("67", "Transação não autorizada. Cartão bloqueado para compras hoje."),
    TRANSACAO_NAO_AUTORIZADA_70("70", "Transação não autorizada. Limite excedido/sem saldo."),
    CANCELAMENTO_NAO_EFETUADO_72("72", "Cancelamento não efetuado. Saldo disponível para cancelamento insuficiente."),
    TRANSACAO_NAO_AUTORIZADA_74("74", "Transação não autorizada. A senha está vencida."),
    SENHA_BLOQUEADA("75", "Senha bloqueada. Excedeu tentativas de cartão."),
    CANCELAMENTO_NAO_EFETUADO_76("76", "Cancelamento não efetuado. Banco emissor não localizou a transação original"),
    CANCELAMENTO_NAO_EFETUADO_77("77", "Cancelamento não efetuado. Não foi localizado a transação original"),
    CARTAO_NAO_FOI_DESBLOQUEADO_PELO_PORTADOR("78", "Cartão não foi desbloqueado pelo portador"),
    TRANSACAO_NAO_AUTORIZADA_80("80", "Transação não autorizada. Divergencia na data de transação/pagamento."),
    ERRO_NO_CARTAO("82", "Erro no cartão"),
    TRANSACAO_NAO_AUTORIZADA_83("83", "Transação não autorizada. Erro no controle de senhas"),
    TRANSACAO_NAO_PERMITIDA_85("85", "Transação não permitida. Falha da operação."),
    TRANSACAO_NAO_PERMITIDA_86("86", "Transação não permitida. Falha da operação."),
    ERRO_NA_TRANSACAO("89", "Erro na transação."),
    TRANSACAO_NAO_PERMITIDA_90("90", "Transação não permitida. Falha da operação."),
    BANCO_FORA_DO_AR("91", "Banco fora do ar"),
    TRANSACAO_NAO_AUTORIZADA_92("92", "Transação não autorizada. Tempo de comunicação excedido."),
    TRANSACAO_NAO_AUTORIZADA_93("93", "Transação não autorizada. Violação de regra - Possível erro no cadastro."),
    TENTE_NOVAMENTE_96("96", "Falha no processamento"),
    VALOR_NAO_PERMITIDO("97", "Valor não permitido para essa transação."),
    SISTEMA_INDISPONIVEL("98", "Sistema/comunicação indisponível."),
    SISTEMA_INDISPONIVEL_99("99", "Sistema/comunicação indisponível."),
    SISTEMA_INDISPONIVEL_999("999", "Sistema/comunicação indisponível."),
    TEMPO_EXCEDIDO("AA", "Tempo excedido"),
    USE_FUNCAO_DEBITO("AC", "Use função débito"),
    TENTE_MAIS_TARDE("AE", "Tente Mais Tarde"),
    TRANSACAO_NAO_PERMITIDA_AF("AF", "Transação não permitida. Falha da operação."),
    TRANSACAO_NAO_PERMITIDA_AG("AG", "Transação não permitida. Falha da operação."),
    TRANSACAO_NAO_PERMITIDA_AH("AH", "Transação não permitida. Cartão de crédito sendo usado com débito. Use a função crédito."),
    TRANSACAO_NAO_PERMITIDA_AI("AI", "Transação não autorizada. Autenticação não foi realizada."),
    TRANSACAO_NAO_PERMITIDA_AJ("AJ", "Transação não permitida. Transação de crédito ou débito em uma operação que permite apenas Private Label. Tente novamente selecionando a opção Private Label."),
    TRANSACAO_NAO_AUTORIZADA_AV("AV", "Transação não autorizada. Dados Inválidos"),
    TRANSACAO_NAO_AUTORIZADA_BD("BD", "Transação não permitida. Falha da operação."),
    TRANSACAO_NAO_AUTORIZADA_BL("BL", "Transação não autorizada. Limite diário excedido."),
    TRANSACAO_NAO_AUTORIZADA_BM("BM", "Transação não autorizada. Cartão Inválido"),
    TRANSACAO_NAO_AUTORIZADA_BN("BN", "Transação não autorizada. Cartão ou conta bloqueado."),
    TRANSACAO_NAO_AUTORIZADA_BO("BO", "Transação não permitida. Falha da operação."),
    TRANSACAO_NAO_AUTORIZADA_BP("BP", "Transação não autorizada. Conta corrente inexistente."),
    TRANSACAO_NAO_AUTORIZADA_BV("BV", "Transação não autorizada. Cartão vencido"),
    TRANSACAO_NAO_AUTORIZADA_CF("CF", "Transação não autorizada.C79:J79 Falha na validação dos dados."),
    TRANSACAO_NAO_AUTORIZADA_CG("CG", "Transação não autorizada. Falha na validação dos dados."),
    TRANSACAO_NAO_AUTORIZADA_DA("DA", "Transação não autorizada. Falha na validação dos dados."),
    TRANSACAO_NAO_PERMITIDA_DF("DF", "Transação não permitida. Falha no cartão ou cartão inválido."),
    TRANSACAO_NAO_AUTORIZADA_DM("DM", "Transação não autorizada. Limite excedido/sem saldo."),
    TRANSACAO_NAO_AUTORIZADA_DQ("DQ", "Transação não autorizada. Falha na validação dos dados."),
    TRANSACAO_NAO_AUTORIZADA_DS("DS", "Transação não permitida para o cartão"),
    TRANSACAO_NAO_AUTORIZADA_EB("EB", "Transação não autorizada. Limite diário excedido."),
    TRANSACAO_NAO_AUTORIZADA_EE("EE", "Transação não permitida. Valor da parcela inferior ao mínimo permitido."),
    TRANSACAO_NAO_AUTORIZADA_EK("EK", "Transação não permitida para o cartão"),
    TRANSACAO_NAO_AUTORIZADA_FA("FA", "Transação não autorizada."),
    TRANSACAO_NAO_AUTORIZADA_FC("FC", "Transação não autorizada. Ligue Emissor"),
    TRANSACAO_NEGADA_RETER_CARTAO("FD", "Transação negada. Reter cartão condição especial"),
    TRANSACAO_NAO_AUTORIZADA_FE("FE", "Transação não autorizada. Divergencia na data de transação/pagamento."),
    TRANSACAO_NAO_AUTORIZADA_FF("FF", "Cancelamento OK"),
    TRANSACAO_NAO_AUTORIZADA_FG("FG", "Transação não autorizada. Ligue AmEx. Ligue 08007285090"),
    AGUARDE_CONTATO("GA", "Aguarde Contato"),
    TRANSACAO_NAO_PERMITIDA_GD("GD", "Transação não permitida."),
    TRANSACAO_NAO_PERMITIDA_HJ("HJ", "Transação não permitida. Código da operação inválido."),
    TRANSACAO_NAO_PERMITIDA_IA("IA", "Transação não permitida. Indicador da operação inválido."),
    TRANSACAO_NAO_PERMITIDA_JB("JB", "Transação não permitida. Valor da operação inválido."),
    TRANSACAO_NAO_PERMITIDA_KA("KA", "Transação não permitida. Falha na validação dos dados."),
    TRANSACAO_NAO_PERMITIDA_KB("KB", "Transação não permitida. Selecionado a opção incorrente."),
    TRANSACAO_NAO_AUTORIZADA_KE("KE", "Transação não autorizada. Falha na validação dos dados."),
    TRANSACAO_NAO_AUTORIZADA_N7("N7", "Transação não autorizada. Código de segurança inválido."),
    TRANSACAO_NAO_AUTORIZADA_R1("R1", "Transação não autorizada. Cartão inadimplente (Do not honor)."),
    TRANSACAO_NAO_PERMITIDA_U3("U3", "Transação não permitida. Falha na validação dos dados.")
    ;

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
