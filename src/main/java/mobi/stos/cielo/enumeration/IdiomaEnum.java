package mobi.stos.cielo.enumeration;

public enum IdiomaEnum {

    PT("PT", "Português"),
    EN("EN", "Inglês"),
    ES("ES", "Espanhol");

    final String sigla;
    final String nomeApresentacao;

    private IdiomaEnum(String sigla, String nomeApresentacao) {
        this.sigla = sigla;
        this.nomeApresentacao = nomeApresentacao;
    }

    public String getNomeApresentacao() {
        return nomeApresentacao;
    }

    public String getSigla() {
        return sigla;
    }

    public static  IdiomaEnum valueOfSigla(String sigla) {
        for (IdiomaEnum t : values()) {
            if (t.getSigla().equalsIgnoreCase(sigla)) {
                return t;
            }
        }
        return null;
    }
}
