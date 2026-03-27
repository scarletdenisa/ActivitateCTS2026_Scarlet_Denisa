package cts.clase;

public abstract class Supa implements FelDeMancare{
    protected int gramaj;
    protected boolean esteFierbinte;
    protected String origine;

    public Supa(int gramaj, boolean esteFierbinte, String origine) {
        this.gramaj = gramaj;
        this.esteFierbinte = esteFierbinte;
        this.origine = origine;
    }

    public void afiseazaDescriere(){

    }
}
