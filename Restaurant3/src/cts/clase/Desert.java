package cts.clase;

public abstract class Desert implements FelMancare{
    protected int calorii;
    protected float pret;

    public Desert(int calorii, float pret) {
        this.calorii = calorii;
        this.pret = pret;
    }

    @Override
    public void afiseazaDescriere() {

    }
}
