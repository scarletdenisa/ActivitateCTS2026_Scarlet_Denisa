package cts.fabrici;

import cts.clase.Ciorba;
import cts.clase.FelDeMancare;
import cts.clase.Supa;
import cts.clase.SupaLegume;

public class FabricaSupa implements FabricaFelDeMancare{

    @Override
    public FelDeMancare getFelMancare(TipFelDeMancare tip, int gramaj, boolean esteFierbinte, String origine) {
        TipSupa tipSupa=(TipSupa)tip;
        switch (tipSupa){
            case SUPA_LEGUME  -> {
                return new SupaLegume(gramaj, esteFierbinte, origine);
            }
            case CIORBA -> {
                return new Ciorba(gramaj, esteFierbinte, origine);
            }
        }
        return null;
    }

    @Override
    public FelDeMancare getFelMancare(TipFelDeMancare tip, int gramaj, boolean esteFierbinte, String origine, int calorii) {
        return getFelMancare(tip, gramaj, esteFierbinte, origine);
    }
}
