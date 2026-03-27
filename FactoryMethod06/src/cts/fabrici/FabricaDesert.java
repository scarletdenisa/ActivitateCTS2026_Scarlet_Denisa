package cts.fabrici;

import cts.clase.Clatite;
import cts.clase.Desert;
import cts.clase.FelDeMancare;
import cts.clase.Papanasi;

public class FabricaDesert implements FabricaFelDeMancare{
    public Desert getDesert(TipDesert tip,int gramaj, boolean esteFierbinte, String origine,int calorii){
        switch(tip){
            case CLATITE -> {
                return new Clatite(gramaj, esteFierbinte, origine, calorii);
            }
            case PAPANASI -> {
                return new Papanasi(gramaj, esteFierbinte, origine, calorii);
            }
        }
        return null;
    }

    @Override
    public FelDeMancare getFelMancare(TipFelDeMancare tip, int gramaj, boolean esteFierbinte, String origine) {
        return null;
    }

    @Override
    public FelDeMancare getFelMancare(TipFelDeMancare tip, int gramaj, boolean esteFierbinte, String origine,int calorii) {
        return getDesert((TipDesert) tip,gramaj,esteFierbinte,origine,calorii);
    }
}
