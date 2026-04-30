package cts.clase;

public abstract class Supa implements FelMancare{
    protected int taitei;
    protected String restaurant;
    protected boolean esteFierbinte;

    public Supa(int taitei, String restaurant, boolean esteFierbinte) {
        this.taitei = taitei;
        this.restaurant = restaurant;
        this.esteFierbinte = esteFierbinte;
    }

    @Override
    public  void afiseazaDescriere() {

    }
}
