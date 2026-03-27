package cts.fabrici;

import cts.clase.Ciorba;
import cts.clase.FelDeMancare;
import cts.clase.Supa;
import cts.clase.SupaLegume;

public class FabricaSupa implements FabricaFelDeMancare{
    public Supa getSupa(TipSupa tip,int gramaj, boolean esteFierbinte, String origine){
        switch (tip){
            case CIORBA -> {
                return new Ciorba(gramaj, esteFierbinte, origine);
            }
            case SUPA_LEGUME -> {
                return new SupaLegume(gramaj, esteFierbinte, origine);
            }
        }
        return null;
    }

    @Override
    public FelDeMancare getFelMancare(TipFelDeMancare tip, int gramaj, boolean esteFierbinte, String origine) {
        return getSupa((TipSupa) tip,gramaj,esteFierbinte,origine);
    }

    @Override
    public FelDeMancare getFelMancare(TipFelDeMancare tip, int gramaj, boolean esteFierbinte, String origine,int calorii) {
        return null;
    }
}
