package cts.clase;

public class Ciorba extends Supa{
    public Ciorba(int gramaj, boolean esteFierbinte, String origine) {
        super(gramaj, esteFierbinte, origine);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Ciorba: gramaj="+
                super.gramaj+" este fierbinte="+super.esteFierbinte+
                " origine="+super.origine);
    }
}
