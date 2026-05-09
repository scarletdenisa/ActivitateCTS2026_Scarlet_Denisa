package cts.clase;

public class Brancardier extends PersonalMedical{
    public Brancardier(int varsta, String spital, int experienta,String arie) {
        super(varsta, spital, experienta,arie);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Brancardierul cu varsta "
                +super.varsta+" are experienta de "+super.experienta+
                " ani si lucreaza la spitalul "+super.spital);
    }
}
