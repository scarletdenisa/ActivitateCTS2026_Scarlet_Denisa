package cts.fabrici;

import cts.clase.*;

public class FabricaSupa implements FabricaFelMancare{


    public Supa getSupa(TipSupa tip, int taitei, String restaurant, boolean esteFierbinte){
        switch (tip){
            case SUPA_LEGUME -> {
                return new SupaLegume(taitei, restaurant, esteFierbinte);
            }
            case CIORBA -> {
                return new Ciorba(taitei,restaurant,esteFierbinte);
            }
        }
        return null;
    }

    @Override
    public FelMancare getFelMancare(TipDesert tip, int calorii, float pret) {
        return null;
    }

    @Override
    public FelMancare getFelMancare(TipSupa tip, int taitei, String restaurant, boolean esteFierbinte) {
        return getSupa((TipSupa) tip,taitei,restaurant,esteFierbinte);
    }
}
