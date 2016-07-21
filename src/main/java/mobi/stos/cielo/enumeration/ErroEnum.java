package mobi.stos.cielo.enumeration;

public enum ErroEnum {

    MENSAGEM_INVALIDA(1, "Mensagem inválida", "A mensagem XML está fora do formato especificado pelo arquivo eCommerce.xsd"),
    CREDENCIAIS_INVALIDA(2, "Credenciais inválidas", "Impossibilidade de autenticar uma requisição da loja virtual."),
    TRANSACAO_INEXISTENTE(3, "Transação inexistente", "Não existe transação para o identificador informado"),
    CODIGO_SEGURANCA_INVALIDO(8, "Código de Segurança Inválido", "O código de segurança informado na mensagem é inválido."),
    INCONSISTENCIA_NO_ENVIO_DO_CARTAO(10, "Inconsistência no envio do cartão", "A transação, com ou sem cartão, está divergente com a permissão de envio dessa informação"),
    MODALIDADE_NAO_HABILITADA(11, "Modalidade não habilitada", "A transação está configurada com uma modalidade de pagamento não habilitada para a loja"),
    NUMERO_PARCELAS_INVALIDA(12, "Número de parcelas inválido", "O número de parcelas solicitado ultrapassa o máximo permitido"),
    FLAG_DE_AUTORIZACAO_AUTOMATICA(13, "Flag de autorização automática", "Flag de autorização automática incompatível com a inválida forma de pagamento solicitada"),
    AUTORIZACAO_DIRETA_INVALIDA(14, "Autorização Direta inválida", "A solicitação de Autorização Direta está inválida"),
    AUTORIZACAO_DIRETA_SEM_CARTAO(15, "Autorização Direta sem Cartão", "A solicitação de Autorização Direta está sem cartão"),
    IDENTIFICADOR_TID_INVALIDO(16, "Identificador, TID, inválido", "O TID fornecido está duplicado"),
    CODIGO_SEGURANCA_AUSENTE(17, "Código de segurança ausente", "O código de segurança do cartão não foi enviado (essa informação é sempre obrigatória para Amex)"),
    CODIGO_SEGURANCA_INCONSISTENTE(18, "Indicador de código de segurança inconsistente", "Uso incorreto do indicador de código de segurança"),
    URL_RETORNO_NAO_FORNECIDA(19, "URL de Retorno não fornecida", "A URL de Retorno é obrigatória, exceto para recorrência e autorização direta."),
    STATUS_NAO_PERMITE_AUTORIZACAO(20, "Status não permite autorização", "Não é permitido realizar autorização para o status da transação"),
    PRAZO_AUTORIZACAO_VENCIDA(21, "Prazo de autorização vencido", "Não é permitido realizar autorização, pois o prazo está vencido"),
    NUMERO_PARCELAS_INVALIDO(22, "Número de parcelas inválido", "Não é permitido realizar autorização para este número de parcelas"),
    ENCAMINHAMENTO_A_AUTORIZACAO_NAO_PERMITIDO(25, "Encaminhamento a autorização não permitido", "O resultado da Autenticação da transação não permite a solicitação de Autorização"),
    STATUS_INVALIDO_PARA_CAPTURA(30, "Status inválido para captura", "O status da transação não permite captura"),
    PRAZO_CAPTURA_VENCIDO(31, "Prazo de captura vencido", "A captura não pode ser realizada, pois o prazo para captura está vencido"),
    VALOR_CAPTURA_INVALIDO(32, "Valor de captura inválido", "O valor solicitado para captura não é válido"),
    FALHA_AO_CAPTURA(33, "Falha ao capturar", "Não foi possível realizar a captura"),
    VALOR_TAXA_EMBARQUE_OBRIGATORIO(34, "Valor da taxa de embarque obrigatório", "O valor da taxa de embarque é obrigatório se a captura for parcial e a autorização tiver sido feita com taxa de embarque."),
    BANDEIRA_INVALIDA_PARA_UTILIZACAO_DE_TAXA_DE_EMBARQUE(35, "Bandeira inválida para utilização da Taxa de Embarque", "A bandeira utilizada na transação não tem suporte à taxa de embarque."),
    PRODUTO_INVALIDO_PARA_UTILIZACAO_TAXA_EMBARQUE(36, "Produto inválido para utilização da Taxa de Embarque", "O produto escolhido não tem suporte à taxa de embarque."),
    PRAZO_CANCELAMENTO_VENCIDO(40, "Prazo de cancelamento vencido", "O cancelamento não pode ser realizado, pois o prazo está vencido"),
    FALHA_AO_CANCELAR(42, "Falha ao cancelar", "Não foi possível realizar o cancelamento"),
    VALOR_DE_CANCELAMENTO_MAIOR_QUE_AUTORIZADO(43, "Valor de cancelamento é maior que valor autorizado.", "O valor que está tentando cancelar supera o valor total capturado da transação."),
    RECORRENCIA_INVALIDA(51, "Recorrência Inválida", "As configurações da transação não permitem que a transação recorrente seja efetuada com sucesso."),
    TOKEN_INVALIDO(52, "Token Inválido", "O token fornecido na requisição de autorização não é válido ou está bloqueado."),
    RECORRENCIA_HABILITADA(53, "Recorrência não habilitada", "O cadastro do lojista não permite o envio de transações recorrentes."),
    TRANSACAO_TOKEN_INVALIDO(54, "Transação com Token inválida", "As configurações da transação não permitem que a autorização direta com uso de Token seja efetuada com sucesso."),
    NUMERO_CARTAO_NAO_FORNECIDO(55, "Número do cartão não fornecido", "Foi solicitado criação de Token, porém o número do cartão de crédito não foi fornecido."),
    VALIDADE_CARTAO_NAO_FORNECIDO(56, "Validade do cartão não fornecido", "Foi solicitado criação de Token, porém a validade do cartão de crédito não foi fornecida."),
    ERRO_INESPERADO_GERANDO_TOKEN(57, "Erro inesperado gerando Token", "Falha no sistema ocorrida no momento da geração do Token."),
    TRANSACAO_RECORRENTE_INVALIDA(61, "Transação Recorrente Inválida", "As configurações da transação recorrente estão inválidas."),
    XID_NAO_FORNECIDO(77, "XID não fornecido", "Foi solicitado uma autorização com autenticação externa, porém o campo XID não foi fornecido."),
    CAVV_NAO_FORNECIDO(78, "CAVV não fornecido", "Foi solicitado uma autorização com autenticação externa, porém o campo CAVV não foi fornecido."),
    XID_CAV_NAO_FORNECIDO(86, "XID e CAVV não fornecidos", "Foi solicitado uma autorização com autenticação externa, porém os campos CAVV e XID não foram fornecidos."),
    CAVV_TAMANHO_DIVERGENTE(87, "CAVV com tamanho divergente", "Foi solicitado uma autorização com autenticação externa, porém o campo CAVV possue um tamanho divergente."),
    XID_TAMANHO_DIVERGENTE(88, "XID com tamanho divergente", "Foi solicitado uma autorização com autenticação externa, porém o campo XID possue um tamanho divergente."),
    ECI_TAMANHO_DIVERGENTE(89, "ECI com tamanho divergente", "Foi solicitado uma autorização com autenticação externa, porém o campo ECI possue um tamanho divergente."),
    ECI_INVALIDO(90, "ECI inválido", "Foi solicitado uma autorização com autenticação externa, porém o campo ECI possue um valor inválido."),
    ERRO_INTERNO_AUTENTICACAO(95, "Erro interno de autenticação", "Falha no sistema"),
    SISTEMA_INDISPONIVEL(97, "Sistema indisponível", "Falha no sistema"),
    TIMEOUT(98, "Timeout", "A aplicação não respondeu dentro de 25 segundos"),
    ERRO_INEXPERADO(99, "Erro inesperado", "Falha no sistema");

    private final int code;
    private final String mensagem;
    private final String descricao;

    private ErroEnum(int code, String mensagem, String descricao) {
        this.code = code;
        this.mensagem = mensagem;
        this.descricao = descricao;
    }

    public int getCode() {
        return code;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public static ErroEnum valueOf(int code) {
        for (ErroEnum t : values()) {
            if (t.getCode() == code) {
                return t;
            }
        }
        return null;
    }

}
