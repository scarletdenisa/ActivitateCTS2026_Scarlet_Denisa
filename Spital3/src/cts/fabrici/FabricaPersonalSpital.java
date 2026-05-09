package cts.fabrici;

import cts.clase.PersonalMedical;
import cts.clase.PersonalSpital;

public interface FabricaPersonalSpital {
    public PersonalSpital getPersonal(TipPersonal tip, int varsta, String spital, int experienta);
    public PersonalSpital getPersonal(TipPersonal tip, int varsta, String spital, int experienta,String arie);
}
