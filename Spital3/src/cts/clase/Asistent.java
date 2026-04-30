package cts.clase;

public class Asistent extends PersonalMedical{
    public Asistent(int varsta, String spital, int experienta) {
        super(varsta, spital, experienta);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Asistentul cu varsta "
                +super.varsta+" are experienta de "+super.experienta+
                " ani si lucreaza la spitalul "+super.spital);
    }
}
