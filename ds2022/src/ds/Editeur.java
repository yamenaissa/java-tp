package ds;

public class Editeur {
    private long code;
    private String nomEdit;
    private String paysEdit;

    public Editeur(long code, String nomEdit, String paysEdit) {
        this.code = code;
        this.nomEdit = nomEdit;
        this.paysEdit = paysEdit;
    }

    @Override
    public String toString() {
        return "Editeur{" +
                "code=" + code +
                ", nomEdit='" + nomEdit + '\'' +
                ", paysEdit='" + paysEdit + '\'' +
                '}';
    }
}
