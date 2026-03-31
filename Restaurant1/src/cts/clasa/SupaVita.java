package cts.clasa;

public class SupaVita extends Supa{
    public SupaVita(int calorii, String restaurant, boolean esteFierbinte) {
        super(calorii, restaurant, esteFierbinte);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Supa de vita are calorii="+
                super.calorii+" restaurant="+
                super.restaurant+" esteFierbinte="+
                super.esteFierbinte);
    }
}
