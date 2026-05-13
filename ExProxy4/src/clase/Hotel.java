package clase;

public class Hotel implements IHotel{
    private Rezervare rezervare;

    public Hotel(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

    public Rezervare getRezervare() {
        return rezervare;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("S a realizat o rezervare");
    }

    @Override
    public void anuleazaRezervare() {

        System.out.println("Clientul cu rezervare "+rezervare.getId()+
                " si nr de nopti="+rezervare.getNrNopti()+
                " a anulat rezervarea");
    }
}
