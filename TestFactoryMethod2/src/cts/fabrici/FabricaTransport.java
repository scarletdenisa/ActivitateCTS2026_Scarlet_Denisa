package cts.fabrici;

import cts.clase.Transport;
import cts.clase.TransportAutobuz;
import cts.clase.TransportMicrobuz;

import javax.swing.*;

public class FabricaTransport implements FabricaTransportI{
    public Transport getTransport(TipTransport tip, int nrRoti, String nrImatriculare){
        switch (tip){
            case AUTOBUZ -> {
                return new TransportAutobuz(nrRoti, nrImatriculare);
            }
            case MICROBUZ -> {
                return new TransportMicrobuz(nrRoti, nrImatriculare);
            }
        }
        return null;
    }
}
