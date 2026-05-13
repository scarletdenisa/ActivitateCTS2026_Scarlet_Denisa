package clase;

public class ComandaRezervare implements Comanda{
    private int idRezervare;
    private Masa masa;

    public ComandaRezervare(int idRezervare, Masa masa) {
        this.idRezervare = idRezervare;
        this.masa = masa;
    }

    @Override
    public void rezervaMasa() {
        System.out.println("Comanda de rezervare:");
        masa.primesteOcupari();
    }
}
