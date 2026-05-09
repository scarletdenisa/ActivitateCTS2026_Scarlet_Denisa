package cts.fabrici;

import cts.clase.PachetTuristic;

public interface FabricaPachet {
    public PachetTuristic getPachet(TipPachet tip,String adresa, int camere);
    public PachetTuristic getPachet(TipPachet tip ,int nrRoti, String nrImatriculare);
}
