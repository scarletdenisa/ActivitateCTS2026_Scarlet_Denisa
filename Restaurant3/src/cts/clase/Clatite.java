package cts.clase;

public class Clatite extends Desert{
    public Clatite(int calorii, float pret) {
        super(calorii, pret);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Clatitele au calorii="+super.calorii+
                " si pret="+super.pret);
    }
}
