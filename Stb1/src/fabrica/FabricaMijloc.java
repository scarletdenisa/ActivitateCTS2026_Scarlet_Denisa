package fabrica;

import clase.Autobuz;
import clase.MijlocTransport;
import clase.Tranvai;
import clase.Troleibuz;

public class FabricaMijloc {
    public MijlocTransport getMijlocTransport(TipMijloc tip,int nrRoti, String nrImatriculare, boolean esteFunctional){
        switch (tip){
            case TROLEIBUZ -> {
                return new Troleibuz(nrRoti, nrImatriculare, esteFunctional);
            }
            case AUTOBUZ -> {
                return new Autobuz(nrRoti, nrImatriculare, esteFunctional);
            }
            case TRANVAI -> {
                return new Tranvai(nrRoti, nrImatriculare, esteFunctional);
            }
        }
        return null;
    }
}
