package cts.fabrici;

import cts.clase.Cazare;
import cts.clase.CazareCabana;
import cts.clase.CazareHotel;
import cts.clase.PachetTuristic;

public class FabricaCazare implements FabricaPachet {


    @Override
    public PachetTuristic getPachet(TipPachet tip, String adresa, int camere) {
        TipCazare tipCazare=(TipCazare)tip;
        switch (tipCazare){
            case CABANA -> {
                return new CazareCabana(adresa, camere);
            }
            case HOTEL -> {
                return new CazareHotel(adresa, camere);
            }
        }
        return  null;
    }

    @Override
    public PachetTuristic getPachet(TipPachet tip, int nrRoti, String nrImatriculare) {
        throw new UnsupportedOperationException("eroare");
    }
}
