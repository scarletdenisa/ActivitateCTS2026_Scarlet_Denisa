package cts.clase;

public class Papanasi extends Desert{

    public Papanasi(int gramaj, boolean esteFierbinte, String origine, int calorii) {
        super(gramaj, esteFierbinte, origine, calorii);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Papanasi: gramaj="+
                super.gramaj+" este fierbinte="+super.esteFierbinte+
                " origine="+super.origine+" calorii="+super.calorii);
    }
}
