package cts.clase;

public class Medic extends PersonalSpital{
    public Medic(int varsta, String nume, int experienta) {
        super(varsta, nume, experienta);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Medicul "+super.nume+" are varsta "+
                super.varsta+" si experienta de "+super.experienta+" ani.");
    }
}
