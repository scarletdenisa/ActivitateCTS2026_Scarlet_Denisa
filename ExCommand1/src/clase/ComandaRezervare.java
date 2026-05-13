package clase;

public class ComandaRezervare implements Comanda{
    private Executant executant;

    public ComandaRezervare(Executant executant) {
        this.executant = executant;
    }

    @Override
    public void daComanda() {
        executant.afiseaza();
    }
}
