package cts.main;

import cts.clasa.Supa;
import cts.fabrica.FabricaSupa;
import cts.fabrica.TipSupa;

public class Main {
    public static void main(String[] args) {

        FabricaSupa fabricaSupa=new FabricaSupa();
        Supa ciuperci= fabricaSupa.getSupa(TipSupa.SUPA_CIUPERCI,100,"Ceaun",false);
        Supa vita=fabricaSupa.getSupa(TipSupa.SUPA_VITA,500,"VitaVela",true);

        ciuperci.afiseazaDescriere();
        vita.afiseazaDescriere();
    }
}