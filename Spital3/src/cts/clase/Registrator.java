package cts.clase;

public class Registrator extends PersonalNonMedical{
    public Registrator(int varsta, String spital, int experienta) {
        super(varsta, spital, experienta);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Registratorul cu varsta "
                +super.varsta+" are experienta de "+super.experienta+
                " ani si lucreaza la spitalul "+super.spital);
    }
}
