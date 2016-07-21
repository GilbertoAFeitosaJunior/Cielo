package mobi.stos.cielo.enumeration;

public enum MoedaEnum {

    REAL("986", "R$"),
    DOLAR("840", "USD$");

    final String codigo;
    final String sigla;

    private MoedaEnum(String codigo, String sigla) {
        this.codigo = codigo;
        this.sigla = sigla;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getSigla() {
        return sigla;
    }

    public static MoedaEnum valueOfSigla(String sigla) {
        for (MoedaEnum t : values()) {
            if (t.getSigla().equalsIgnoreCase(sigla)) {
                return t;
            }
        }
        return null;
    }
    
     public static MoedaEnum valueOfCodigo(String codigo) {
        for (MoedaEnum t : values()) {
            if (t.getCodigo().equalsIgnoreCase(codigo)) {
                return t;
            }
        }
        return null;
    }
}
