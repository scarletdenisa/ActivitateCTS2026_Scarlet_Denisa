package cts.fabrici;

import cts.clase.Desert;
import cts.clase.FelMancare;
import cts.clase.Supa;

public interface FabricaFelMancare {
    public FelMancare getFelMancare(TipDesert tip, int calorii, float pret);
    public FelMancare getFelMancare(TipSupa tip, int taitei, String restaurant, boolean esteFierbinte);

}
