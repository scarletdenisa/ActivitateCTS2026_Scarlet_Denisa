package clase;

public class Autobuz {
    private int nrPasageri;
    private String nrImatriculare;

    public int getNrPasageri() {
        return nrPasageri;
    }

    public String getNrImatriculare() {
        return nrImatriculare;
    }

    public Autobuz(int nrPasageri, String nrImatriculare) {
        this.nrPasageri = nrPasageri;
        this.nrImatriculare = nrImatriculare;
    }
}
