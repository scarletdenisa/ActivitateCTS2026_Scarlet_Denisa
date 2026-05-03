package proxy;

import clase.InterfataHotel;
import clase.Rezervare;

public class ProxyRezervare implements InterfataHotel {
    private InterfataHotel hotel;

    public ProxyRezervare(InterfataHotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public void anuleazaRezervare(Rezervare rezervare) {
        if(rezervare.getNrNopti()<=1)
            hotel.anuleazaRezervare(rezervare);
        else
            System.out.println("Rezervarea "+rezervare.toString()
                    +"are mai mult de o noapte si nu se poate anula gratuit");
    }
}
