package clase;

public class Rezervare {
    private String idRezervare;
    private int nrNopti;

    public Rezervare(String idRezervare, int nrNopti) {
        this.idRezervare = idRezervare;
        this.nrNopti = nrNopti;
    }

    public String getIdRezervare() {
        return idRezervare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("idRezervare=").append(idRezervare);
        sb.append(", nrNopti=").append(nrNopti);
        sb.append('}');
        return sb.toString();
    }

    public void setIdRezervare(String idRezervare) {
        this.idRezervare = idRezervare;
    }

    public int getNrNopti() {
        return nrNopti;
    }

    public void setNrNopti(int nrNopti) {
        this.nrNopti = nrNopti;
    }
}
