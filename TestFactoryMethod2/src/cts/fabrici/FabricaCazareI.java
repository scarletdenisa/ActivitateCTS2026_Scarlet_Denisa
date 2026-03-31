package cts.fabrici;

import cts.clase.Cazare;

public interface FabricaCazareI {
    public Cazare getCazare(TipCazare tip,String adresa, int camere);
}
