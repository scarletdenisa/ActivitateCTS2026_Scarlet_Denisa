package cts.fabrici;

import cts.clase.Clatite;
import cts.clase.Desert;
import cts.clase.FelDeMancare;
import cts.clase.Papanasi;

public class FabricaDesert implements FabricaFelDeMancare{
    @Override
    public FelDeMancare getFelMancare(TipFelDeMancare tip, int gramaj, boolean esteFierbinte, String origine,int calorii) {
        TipDesert tipDesert=(TipDesert)tip;
        switch(tipDesert){
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
        return this.getFelMancare(tip,gramaj,esteFierbinte,origine,500);
    }


}
