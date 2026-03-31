package cts.main;


import cts.clase.PersonalSpital;
import cts.fabrica.FabricaPersonalSpital;
import cts.fabrica.TipPersonalSpital;

public class Main {
    public static void main(String[] args) {

        FabricaPersonalSpital fabrica=new FabricaPersonalSpital();
        PersonalSpital asistent= fabrica.getPersonal(TipPersonalSpital.ASISTENT,33,"Alex",9);
        PersonalSpital medic= fabrica.getPersonal(TipPersonalSpital.MEDIC,21,"Daria",1);
        asistent.afiseazaDescriere();
        medic.afiseazaDescriere();
    }
}