package cts.clase;

public class SupaLegume extends Supa{
    public SupaLegume(int taitei, String restaurant, boolean esteFierbinte) {
        super(taitei, restaurant, esteFierbinte);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Supa de legume are taitei="+super.taitei+
                " restaurant="+super.restaurant+
                " esteFierbinte="+super.esteFierbinte);
    }
}
