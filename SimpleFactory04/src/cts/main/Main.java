package cts.main;

import cts.clase.MijlocTransport;
import cts.fabrica.Depou;
import cts.fabrica.TipuriMijlocTransport;

public class Main {
    public static void main(String[] args) {

        Depou depou=new Depou();
        MijlocTransport autobuz= depou.getMijlocTransport(TipuriMijlocTransport.AUTOBUZ,6,"B100AAA");
        MijlocTransport tramvai=depou.getMijlocTransport(TipuriMijlocTransport.TRAMVAI,10,"BV10SCA");
        autobuz.afiseazaDescriere();
        tramvai.afiseazaDescriere();
    }
}