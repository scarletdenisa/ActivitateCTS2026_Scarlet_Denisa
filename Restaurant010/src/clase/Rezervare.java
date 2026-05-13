package clase;

public class Rezervare {
    private int nrMasa;
    private int nrpers;
    private String ora;

    public Rezervare(int nrMasa, int nrpers, String ora) {
        this.nrMasa = nrMasa;
        this.nrpers = nrpers;
        this.ora = ora;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nrMasa=").append(nrMasa);
        sb.append(", nrpers=").append(nrpers);
        sb.append(", ora='").append(ora).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
