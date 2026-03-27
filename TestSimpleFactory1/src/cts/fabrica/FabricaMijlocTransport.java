package cts.fabrica;

import cts.clase.Autobuz;
import cts.clase.MijlocTransport;
import cts.clase.Tranvai;
import cts.clase.Troleibuz;

public class FabricaMijlocTransport {

    public MijlocTransport getMijlocTransport(TipMijocTransport tip,String numarImatriculare, String oras){
        switch (tip){
            case TROLEIBUZ -> {
                return new Troleibuz(numarImatriculare, oras);
            }
            case AUTOBUZ -> {
                return new Autobuz(numarImatriculare,oras);
            }
            case TRANVAI -> {
                return new Tranvai(numarImatriculare, oras);
            }
        }
        return null;

    }
}
