package cts.fabrici;

import cts.clase.*;

public class FabricaPersonalMedical implements FabricaPersonalSpital {

    @Override
    public PersonalSpital getPersonal(TipPersonal tip, int varsta, String spital, int experienta,String arie) {
        TipPersonalMedical tipPersonalMedical=(TipPersonalMedical) tip;
        switch (tipPersonalMedical){
            case BRANCARDIER -> {
                return new Brancardier(varsta, spital, experienta,arie);
            }
            case MEDIC -> {
                return new Medic(varsta, spital, experienta,arie);
            }
            case ASISTENT -> {
                return new Asistent(varsta, spital, experienta,arie);
            }
        }
        return null;
    }

    @Override
    public PersonalSpital getPersonal(TipPersonal tip, int varsta, String spital, int experienta) {
        return this.getPersonal(tip,varsta,spital,experienta,"stomaologie");
    }
}
