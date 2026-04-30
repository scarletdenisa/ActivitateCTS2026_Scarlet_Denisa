package cts.fabrici;

import cts.clase.Cazare;
import cts.clase.CazareCabana;
import cts.clase.CazareHotel;
import cts.clase.PachetTuristic;

public class FabricaCazare implements FabricaCazareI {


    @Override
    public Cazare getCazare(TipCazare tip, String adresa, int camere) {
       switch (tip){
           case CABANA -> {
               return new CazareCabana(adresa, camere);
           }
           case HOTEL -> {
               return new CazareHotel(adresa, camere);
           }
       }
       return  null;
    }
}
