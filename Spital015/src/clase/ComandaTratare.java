package clase;

public class ComandaTratare implements Comanda{
    private int nrTratare;
    private Medic medic;

    public ComandaTratare(int nrTratare, Medic medic) {
        this.nrTratare = nrTratare;
        this.medic = medic;
    }

    @Override
    public void daComenzi() {
        System.out.println("Comanda de tratare: ");
        medic.preiaPacienti();
    }
}
