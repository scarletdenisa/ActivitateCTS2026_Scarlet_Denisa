package cts.main;

import cts.clase.FelMancare;
import cts.fabrici.*;

public class Main {
    public static void main(String[] args) {

        FabricaFelMancare fabrica=new FabricaSupa();
        FelMancare supa= fabrica.getFelMancare(TipSupa.SUPA_LEGUME,4,"LaC",true);
        FelMancare supa2=fabrica.getFelMancare(TipSupa.CIORBA,1,"Restaurant",true);

        FabricaFelMancare fabrica2=new FabricaDesert();
        FelMancare clatite=fabrica2.getFelMancare(TipDesert.CLATITE,100,12.3f);
        FelMancare cheesecake=fabrica2.getFelMancare(TipDesert.CHEESSECAKE,200,23.4f);

        supa.afiseazaDescriere();
        supa2.afiseazaDescriere();
        clatite.afiseazaDescriere();
        cheesecake.afiseazaDescriere();
    }
}