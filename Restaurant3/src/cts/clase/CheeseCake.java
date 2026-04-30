package cts.clase;

public class CheeseCake extends Desert{
    public CheeseCake(int calorii, float pret) {
        super(calorii, pret);
    }
    @Override
    public void afiseazaDescriere() {
        System.out.println("CheeseCakeul are calorii="+super.calorii+
                " si pret="+super.pret);
    }
}
