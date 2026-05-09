package cts.fabrici;

import cts.clase.PachetTuristic;
import cts.clase.Transport;
import cts.clase.TransportAutobuz;
import cts.clase.TransportMicrobuz;

import javax.swing.*;

public class FabricaTransport implements FabricaPachet{

    @Override
    public PachetTuristic getPachet(TipPachet tip, String adresa, int camere) {
        throw new UnsupportedOperationException("eroare");
    }

    @Override
    public PachetTuristic getPachet(TipPachet tip, int nrRoti, String nrImatriculare) {
        TipTransport tipTransport=(TipTransport)tip;
        switch (tipTransport){
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
