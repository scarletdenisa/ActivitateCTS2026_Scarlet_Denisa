package main;

import clase.MijlocTransport;
import fabrica.FabricaMijloc;
import fabrica.TipMijloc;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FabricaMijloc fabrica=new FabricaMijloc();
        MijlocTransport autobuz= fabrica.getMijlocTransport(TipMijloc.AUTOBUZ,4,"B11AAA",true);
        autobuz.afiseazaDescriere();
    }
}