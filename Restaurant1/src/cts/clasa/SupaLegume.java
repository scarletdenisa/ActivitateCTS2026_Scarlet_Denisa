package cts.clasa;

public class SupaLegume extends Supa{
    public SupaLegume(int calorii, String restaurant, boolean esteFierbinte) {
        super(calorii, restaurant, esteFierbinte);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Supa de legume are calorii="+
                        super.calorii+" restaurant="+
                        super.restaurant+" esteFierbinte="+
                        super.esteFierbinte);
    }
}
