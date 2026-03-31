package cts.main;

import cts.clase.PersonalMedical;
import cts.clase.PersonalNonMedical;
import cts.fabrici.FabricaPersonalMedical;
import cts.fabrici.FabricaPersonalNonMedical;
import cts.fabrici.TipPersonalMedical;
import cts.fabrici.TipPersonalNonMedical;

public class Main {
    public static void main(String[] args) {

        FabricaPersonalMedical fabrica1=new FabricaPersonalMedical();
        PersonalMedical asistent= fabrica1.getPersonal(TipPersonalMedical.ASISTENT,23,"Sf Constantin",3);

        FabricaPersonalNonMedical fabrica2=new FabricaPersonalNonMedical();
        PersonalNonMedical secretar= fabrica2.getPersonalNonMedical(TipPersonalNonMedical.SECRETAR,22,"Spital",10);

        asistent.afiseazaDescriere();
        secretar.afiseazaDescriere();
    }
}