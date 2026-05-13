package clase;

public class Spitalizare {
    private int nrSalon;
    private int nrPat;
    private int nrZile;

    public Spitalizare(int nrSalon, int nrPat, int nrZile) {
        this.nrSalon = nrSalon;
        this.nrPat = nrPat;
        this.nrZile = nrZile;

    }

    public Spitalizare() {
        this.nrSalon = nrSalon;
        this.nrPat = nrPat;
        this.nrZile = nrZile;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Spitalizare{");
        sb.append("nrSalon=").append(nrSalon);
        sb.append(", nrPat=").append(nrPat);
        sb.append(", nrZile=").append(nrZile);
        sb.append('}');
        return sb.toString();
    }
}
