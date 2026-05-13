package clase;

public class Rezervare {
    private int nrNopti;
    private int id;

    public Rezervare(int nrNopti, int id) {
        this.nrNopti = nrNopti;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getNrNopti() {
        return nrNopti;
    }
}
