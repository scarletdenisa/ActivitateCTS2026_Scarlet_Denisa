package clase;

public abstract class MijlocTransport {
    protected int nrRoti;
    protected String nrImatriculare;
    protected boolean esteFunctional;

    public MijlocTransport(int nrRoti, String nrImatriculare, boolean esteFunctional) {
        this.nrRoti = nrRoti;
        this.nrImatriculare = nrImatriculare;
        this.esteFunctional = esteFunctional;
    }

    public abstract void afiseazaDescriere();
}
