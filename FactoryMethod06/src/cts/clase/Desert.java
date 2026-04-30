package cts.clase;

public abstract class Desert implements FelDeMancare {
    protected int gramaj;
    protected boolean esteFierbinte;
    protected String origine;
    protected int calorii;

    public Desert(int gramaj, boolean esteFierbinte, String origine, int calorii) {
        this.gramaj = gramaj;
        this.esteFierbinte = esteFierbinte;
        this.origine = origine;
        this.calorii = calorii;
    }

    public void afiseazaDescriere(){

    }
}
