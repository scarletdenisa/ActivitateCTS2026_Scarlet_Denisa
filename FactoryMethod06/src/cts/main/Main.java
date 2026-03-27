package cts.main;


import cts.clase.FelDeMancare;
import cts.fabrici.*;

public class Main {
    public static void main(String[] args) {

        FabricaFelDeMancare fabricaSupa=new FabricaSupa();
        FelDeMancare supaLegume= fabricaSupa.getFelMancare(TipSupa.SUPA_LEGUME,500,true,"romania");
        FelDeMancare ciorba= fabricaSupa.getFelMancare(TipSupa.CIORBA,100,false,"romania");
        supaLegume.afiseazaDescriere();
        ciorba.afiseazaDescriere();

        FabricaFelDeMancare fabricaDesert=new FabricaDesert();
        FelDeMancare papanasi= fabricaDesert.getFelMancare(TipDesert.PAPANASI,1000,false,"turcia",300);
        FelDeMancare clatite=fabricaDesert.getFelMancare(TipDesert.CLATITE,250,true,"polonia",150);
        papanasi.afiseazaDescriere();
        clatite.afiseazaDescriere();
    }
}