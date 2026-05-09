package cts.main;

import cts.clase.PersonalMedical;
import cts.clase.PersonalNonMedical;
import cts.clase.PersonalSpital;
import cts.fabrici.*;

public class Main {
    public static void main(String[] args) {

        FabricaPersonalSpital fabrica=new FabricaPersonalMedical();
        PersonalSpital asistent= fabrica.getPersonal(TipPersonalMedical.ASISTENT,33,"Constantin",5,"implant");
        asistent.afiseazaDescriere();

        FabricaPersonalSpital fabrica2=new FabricaPersonalNonMedical();
        PersonalSpital secretar= fabrica.getPersonal(TipPersonalNonMedical.SECRETAR,12,"spital",4);
        secretar.afiseazaDescriere();
    }
}