package cts.fabrici;

import cts.clase.*;

public class FabricaPersonalMedical  {

    public PersonalMedical getPersonal(TipPersonalMedical tip, int varsta, String spital, int experienta) {
        switch (tip){
            case BRANCARDIER -> {
                return new Brancardier(varsta, spital, experienta);
            }
            case MEDIC -> {
                return new Medic(varsta, spital, experienta);
            }
            case ASISTENT -> {
                return new Asistent(varsta, spital, experienta);
            }
        }
        return null;
    }
}
