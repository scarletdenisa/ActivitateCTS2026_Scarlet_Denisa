package cts.fabrica;

import cts.clase.Asistent;
import cts.clase.Brancardier;
import cts.clase.Medic;
import cts.clase.PersonalSpital;

public class FabricaPersonalSpital {

    public PersonalSpital getPersonal(TipPersonalSpital tip,int varsta, String nume, int experienta){
        switch (tip){
            case MEDIC -> {
                return new Medic(varsta, nume, experienta);
            }
            case ASISTENT -> {
                return new Asistent(varsta, nume, experienta);
            }
            case BRANCARDIER -> {
                return new Brancardier(varsta, nume, experienta);
            }
        }
        return null;
    }
}
