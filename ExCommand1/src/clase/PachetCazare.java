package clase;

public class PachetCazare implements Executant{
    private int idpachet;

    public PachetCazare(int idpachet) {
        this.idpachet = idpachet;
    }

    @Override
    public void afiseaza() {
        System.out.println("Pachetul de cazare cu id "+this.idpachet+
                " a fost comandat");
    }
}
