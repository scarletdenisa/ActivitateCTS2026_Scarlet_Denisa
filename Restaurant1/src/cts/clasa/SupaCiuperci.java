package cts.clasa;

public class SupaCiuperci extends Supa{
    public SupaCiuperci(int calorii, String restaurant, boolean esteFierbinte) {
        super(calorii, restaurant, esteFierbinte);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Supa de ciuperci are calorii="+
                super.calorii+" restaurant="+
                super.restaurant+" esteFierbinte="+
                super.esteFierbinte);
    }
}
