package clase;

public class Proxy implements IRezervare{
    private IRezervare rezervare;

    public Proxy(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void afiseazaRezervare() {
        if (((Rezervare)rezervare).getNrPers()>=4)
            rezervare.afiseazaRezervare();
        else System.out.println("Nu sunt suficiente persoane pt a rezerva o masa");
    }
}
