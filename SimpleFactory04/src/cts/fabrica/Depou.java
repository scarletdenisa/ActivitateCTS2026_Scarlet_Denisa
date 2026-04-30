package cts.fabrica;

import cts.clase.Autobuz;
import cts.clase.MijlocTransport;
import cts.clase.Tramvai;
import cts.clase.Troleibuz;

public class Depou {

//    public MijlocTransport getMijlocTransport(TipuriMijlocTransport tip,int numarRoti, String numarImatriculare){
//        if(tip==TipuriMijlocTransport.AUTOBUZ)
//            return new Autobuz(numarRoti,numarImatriculare);
//        if(tip==TipuriMijlocTransport.TRAMVAI)
//            return new Tramvai(numarRoti,numarImatriculare);
//        if(tip==TipuriMijlocTransport.TROLEIBUZ)
//            return new Troleibuz(numarRoti,numarImatriculare);
//        return null;
//    }

    public MijlocTransport getMijlocTransport(TipuriMijlocTransport tip,int numarRoti, String numarImatriculare){
        switch (tip){
            case AUTOBUZ:
                return new Autobuz(numarRoti,numarImatriculare);
            case TRAMVAI:
                return new Tramvai(numarRoti,numarImatriculare);
            case TROLEIBUZ:
                return new Troleibuz(numarRoti, numarImatriculare);

        }
        return null;

    }
}
