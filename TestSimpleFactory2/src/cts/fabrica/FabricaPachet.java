package cts.fabrica;

import cts.clase.PachetCazare;
import cts.clase.PachetCazareTransport;
import cts.clase.PachetTransport;
import cts.clase.PachetTuristic;

public class FabricaPachet {

    public PachetTuristic getPachet(TipPachet tip){
        switch (tip){
            case pachetCazare -> {
                return new PachetCazare();
            }
            case pachetTransport -> {
                return new PachetTransport();
            }
            case pachetCazareTransport -> {
                return new PachetCazareTransport();
            }
        }
        return null;
    }
}
