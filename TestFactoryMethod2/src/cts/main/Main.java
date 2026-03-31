package cts.main;

import cts.clase.Cazare;
import cts.clase.Transport;
import cts.fabrici.FabricaCazare;
import cts.fabrici.FabricaTransport;
import cts.fabrici.TipCazare;
import cts.fabrici.TipTransport;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FabricaCazare fabricaCazare=new FabricaCazare();
        Cazare hotel=fabricaCazare.getCazare(TipCazare.HOTEL,"buc",3);

        FabricaTransport fabricaTransport=new FabricaTransport();
        Transport autobuz=fabricaTransport.getTransport(TipTransport.AUTOBUZ,8,"B100AAA");

        hotel.afiseazaDescriere();
        autobuz.afiseazaDescriere();
    }
}