package clase;

public class ComandaInternare implements Comanda{
    private int nrInternare;
    private Medic medic;

    public ComandaInternare(int nrInternare, Medic medic) {
        this.nrInternare = nrInternare;
        this.medic = medic;
    }

    @Override
    public void daComenzi() {
        System.out.println("Comanda de internare: ");
        medic.preiaPacienti();
    }
}
