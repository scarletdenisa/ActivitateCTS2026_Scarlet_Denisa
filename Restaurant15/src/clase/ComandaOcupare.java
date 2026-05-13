package clase;

public class ComandaOcupare implements Comanda{
    private int idOcupare;
    private Masa masa;

    public ComandaOcupare(int idOcupare,Masa masa) {
        this.idOcupare = idOcupare;
        this.masa=masa;
    }

    @Override
    public void rezervaMasa() {
        System.out.println("Comanda de ocupare:");
        masa.primesteOcupari();
    }
}
