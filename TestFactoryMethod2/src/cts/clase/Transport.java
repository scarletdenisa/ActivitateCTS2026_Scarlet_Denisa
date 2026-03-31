package cts.clase;

public abstract class Transport implements PachetTuristic{
    protected int nrRoti;
    protected String nrImatriculare;

    public Transport(int nrRoti, String nrImatriculare) {
        this.nrRoti = nrRoti;
        this.nrImatriculare = nrImatriculare;
    }

    @Override
    public void afiseazaDescriere() {

    }
}
