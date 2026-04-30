package cts.main;


import cts.clase.Autobuz;
import cts.clase.MijlocTransport;
import cts.fabrica.FabricaMijlocTransport;
import cts.fabrica.TipMijocTransport;

public class Main {
    public static void main(String[] args) {

        FabricaMijlocTransport fabricaMijlocTransport=new FabricaMijlocTransport();
        MijlocTransport autobuz1=fabricaMijlocTransport.getMijlocTransport(TipMijocTransport.AUTOBUZ,"B55AAA","Bucurest");
        MijlocTransport troleibuz1=fabricaMijlocTransport.getMijlocTransport(TipMijocTransport.TROLEIBUZ,"BV78BBB","Brasov");
        MijlocTransport troleibuz2= fabricaMijlocTransport.getMijlocTransport(TipMijocTransport.TROLEIBUZ,"AG01CCC","Arges");
        MijlocTransport tranvai= fabricaMijlocTransport.getMijlocTransport(TipMijocTransport.TRANVAI,"BC10DDD","Bacau");

        autobuz1.afiseazaDescriere();
        troleibuz1.afiseazaDescriere();
        troleibuz2.afiseazaDescriere();
        tranvai.afiseazaDescriere();
    }
}