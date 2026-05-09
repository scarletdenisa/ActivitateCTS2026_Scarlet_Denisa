package cts.fabrici;

import cts.clase.PersonalNonMedical;
import cts.clase.PersonalSpital;
import cts.clase.Registrator;
import cts.clase.Secretar;

public class FabricaPersonalNonMedical implements FabricaPersonalSpital {

    @Override
    public PersonalSpital getPersonal(TipPersonal tip, int varsta, String spital, int experienta) {
        TipPersonalNonMedical tipPersonalNonMedical=(TipPersonalNonMedical) tip;
        switch (tipPersonalNonMedical){
            case REGISTRATOR -> {
                return new Registrator(varsta, spital, experienta);
            }
            case SECRETAR -> {
                return new Secretar(varsta, spital, experienta);
            }
        }
        return null;
    }

    @Override
    public PersonalSpital getPersonal(TipPersonal tip, int varsta, String spital, int experienta, String arie) {
        return getPersonal(tip, varsta, spital, experienta);
    }
}
