package cts.clase;

public class SupaLegume extends Supa{

    public SupaLegume(int gramaj, boolean esteFierbinte, String origine) {
        super(gramaj, esteFierbinte, origine);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Supa de legume: gramaj="+
                super.gramaj+" este fierbinte="+super.esteFierbinte+
                " origine="+origine);
    }
}
