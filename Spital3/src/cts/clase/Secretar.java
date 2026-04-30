package cts.clase;

public class Secretar extends PersonalNonMedical{
    public Secretar(int varsta, String spital, int experienta) {
        super(varsta, spital, experienta);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Secretar cu varsta "
                +super.varsta+" are experienta de "+super.experienta+
                " ani si lucreaza la spitalul "+super.spital);
    }
}
