package cts.clase;

public class Brancardier extends PersonalSpital{
    public Brancardier(int varsta, String nume, int experienta) {
        super(varsta, nume, experienta);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Brancardierul "+super.nume+" are varsta "+
                super.varsta+" si experienta de "+super.experienta+" ani.");
    }
}
