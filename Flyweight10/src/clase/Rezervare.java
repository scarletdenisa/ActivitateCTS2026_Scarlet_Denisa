package clase;

public class Rezervare {
    private int nrMasa;
    private int nrPersoane;
    private String ora;

    public Rezervare(int nrMasa, String ora, int nrPersoane) {
        this.nrMasa = nrMasa;
        this.ora = ora;
        this.nrPersoane = nrPersoane;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nrMasa=").append(nrMasa);
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", ora='").append(ora).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
