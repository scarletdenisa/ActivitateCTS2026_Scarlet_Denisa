package cts.fabrici;

import cts.clase.PersonalNonMedical;
import cts.clase.Registrator;
import cts.clase.Secretar;

public class FabricaPersonalNonMedical {
    public PersonalNonMedical getPersonalNonMedical(TipPersonalNonMedical tip,int varsta,String spital,int experienta){
        switch (tip){
            case SECRETAR -> {
                return new Secretar(varsta, spital, experienta);
            }
            case REGISTRATOR -> {
                return new Registrator(varsta, spital, experienta);
            }

        }
        return null;
    }
}
