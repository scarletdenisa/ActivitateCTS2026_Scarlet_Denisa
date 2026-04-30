package cts.clase;

public class Asistent extends PersonalSpital{
    public Asistent(int varsta, String nume, int experienta) {
        super(varsta, nume, experienta);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Asistentul "+super.nume+" are varsta "+
                super.varsta+" si experienta de "+super.experienta+" ani.");
    }
}
