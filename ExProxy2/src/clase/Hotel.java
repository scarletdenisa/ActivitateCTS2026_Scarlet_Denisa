package clase;

public class Hotel implements InterfataHotel{
    private String nume;

    public Hotel(String nume) {
        this.nume = nume;
    }

    @Override
    public void anuleazaRezervare(Rezervare rezervare) {
        System.out.println(rezervare.toString()+" este la hotelul "+
                this.nume+" si poate fi anulata");
    }
}
