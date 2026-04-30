package cts.clase;

public class CazareHotel extends Cazare{
    public CazareHotel(String adresa, int camere) {
        super(adresa, camere);
    }
    @Override
    public void afiseazaDescriere() {
        System.out.println("Hotelul are adresa="+super.adresa+
                " si camere="+super.camere);
    }
}
