package cts.clase;

public class Medic extends PersonalMedical{
    public Medic(int varsta, String spital, int experienta,String arie) {
        super(varsta, spital, experienta,arie);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Medicul cu varsta "
                +super.varsta+" are experienta de "+super.experienta+
                " ani si lucreaza la spitalul "+super.spital);
    }
}
