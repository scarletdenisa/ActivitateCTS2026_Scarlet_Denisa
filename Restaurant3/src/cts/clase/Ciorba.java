package cts.clase;

public class Ciorba extends Supa{
    public Ciorba(int taitei, String restaurant, boolean esteFierbinte) {
        super(taitei, restaurant, esteFierbinte);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Ciorba are taitei="+super.taitei+
                " restaurant="+super.restaurant+
                " esteFierbinte="+super.esteFierbinte);
    }
}
