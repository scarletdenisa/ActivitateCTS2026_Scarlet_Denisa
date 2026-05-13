package clase;

public class ComandaVanzare implements Comanda{
    private Executant executant;

    public ComandaVanzare(Executant executant) {
        this.executant = executant;
    }

    @Override
    public void daComanda() {
        executant.afiseaza();
    }
}
