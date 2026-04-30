package cts.fabrici;

import cts.clase.PachetTuristic;
import cts.clase.Transport;

public interface FabricaTransportI {
    public Transport getTransport(TipTransport tip, int nrRoti, String nrImatriculare);
}
