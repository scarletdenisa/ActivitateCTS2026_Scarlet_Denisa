package cts.clase;

public class Clatite extends Desert{

    public Clatite(int gramaj, boolean esteFierbinte, String origine, int calorii) {
        super(gramaj, esteFierbinte, origine, calorii);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Clatite: gramaj="+
                super.gramaj+" este fierbinte="+super.esteFierbinte+
                " origine="+super.origine+" calorii="+super.calorii);
    }
}
