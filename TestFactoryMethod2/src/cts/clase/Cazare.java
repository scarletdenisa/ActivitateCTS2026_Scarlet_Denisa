package cts.clase;

public abstract class Cazare implements PachetTuristic{
    protected String adresa;
    protected int camere;

    public Cazare(String adresa, int camere) {
        this.adresa = adresa;
        this.camere = camere;
    }

    @Override
    public void afiseazaDescriere() {

    }
}
