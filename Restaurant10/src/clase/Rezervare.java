package clase;

public class Rezervare {
    private int nrMasa;
    private int nrPersonae;
    private String ora;

    public Rezervare(int nrMasa, String ora, int nrPersonae) {
        this.nrMasa = nrMasa;
        this.ora = ora;
        this.nrPersonae = nrPersonae;
    }

    public int getNrPersonae() {
        return nrPersonae;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nrMasa=").append(nrMasa);
        sb.append(", nrPersonae=").append(nrPersonae);
        sb.append(", ora='").append(ora).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
