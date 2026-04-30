package cts.fabrici;

import cts.clase.*;

public class FabricaDesert implements FabricaFelMancare {
    public Desert getDesert(TipDesert tip,int calorii, float pret){
        switch (tip){
            case CLATITE -> {
                return new Clatite(calorii, pret);
            }
            case CHEESSECAKE -> {
                return new CheeseCake(calorii, pret);
            }
        }
        return null;
    }


    @Override
    public FelMancare getFelMancare(TipDesert tip, int calorii, float pret) {
        return getDesert((TipDesert) tip,calorii,pret);
    }

    @Override
    public FelMancare getFelMancare(TipSupa tip, int taitei, String restaurant, boolean esteFierbinte) {
        return null;
    }
}
