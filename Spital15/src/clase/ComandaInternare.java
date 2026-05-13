package clase;

public class ComandaInternare implements Comanda{
    private Medic medic;
    private Pacient p;

    public ComandaInternare(Medic medic, Pacient p) {
        this.medic = medic;
        this.p = p;
    }

    @Override
    public void executa() {
        System.out.println("Comanda de internare:");
        medic.preiapacient(p);
    }

}
