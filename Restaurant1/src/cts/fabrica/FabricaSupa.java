package cts.fabrica;

import cts.clasa.Supa;
import cts.clasa.SupaCiuperci;
import cts.clasa.SupaLegume;
import cts.clasa.SupaVita;

public class FabricaSupa {
    public Supa getSupa(TipSupa tip,int calorii, String restaurant, boolean esteFierbinte){
        switch (tip){
            case SUPA_LEGUME -> {
                return new SupaLegume(calorii, restaurant, esteFierbinte);
            }
            case SUPA_CIUPERCI -> {
                return new SupaCiuperci(calorii, restaurant, esteFierbinte);
            }
            case SUPA_VITA ->
            {
                return new SupaVita(calorii, restaurant, esteFierbinte);
            }
        }
        return null;
    }
}
