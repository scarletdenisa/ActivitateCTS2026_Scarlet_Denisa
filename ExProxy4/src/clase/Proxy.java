package clase;

public class Proxy implements IHotel{
    private Hotel hotel;

    public Proxy(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public void afiseazaDetalii() {
        hotel.afiseazaDetalii();
    }

    @Override
    public void anuleazaRezervare() {

        if (hotel.getRezervare().getNrNopti()<=1)
            hotel.anuleazaRezervare();
        else
            System.out.println("Rezervarea este de mai mult de o noapte si nu se poate anula");
    }
}
