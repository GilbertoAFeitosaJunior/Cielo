package mobi.stos.cielo.enumeration;

public enum BandeiraEnum {

    VISA("Visa", "vs"),
    MARTERCARD("MasterCard", "mc"),
    DINERS("Diners", "dn"),
    DISCOVER("Discover", "ds"),
    ELO("Elo", "el"),
    AMEX("Amex", "am"),
    JCB("JCB", "jc"),
    AURA("Aura", "au");

    final String nomeApresentacao;
    final String sigla;

    private BandeiraEnum(String nomeApresentacao, String sigla) {
        this.nomeApresentacao = nomeApresentacao;
        this.sigla = sigla;
    }

    public String getNomeApresentacao() {
        return nomeApresentacao;
    }

    public String getSigla() {
        return sigla;
    }

    public static  BandeiraEnum valueOfSigla(String sigla) {
        for (BandeiraEnum t : values()) {
            if (t.getNomeApresentacao().equalsIgnoreCase(sigla)) {
                return t;
            }
        }
        return null;
    }
}
