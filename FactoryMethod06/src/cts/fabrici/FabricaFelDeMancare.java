package cts.fabrici;

import cts.clase.FelDeMancare;

public interface FabricaFelDeMancare {
    public FelDeMancare getFelMancare (TipFelDeMancare tip, int gramaj, boolean esteFierbinte, String origine);
    public FelDeMancare getFelMancare(TipFelDeMancare tip,int gramaj, boolean esteFierbinte, String origine,int calorii);
}
