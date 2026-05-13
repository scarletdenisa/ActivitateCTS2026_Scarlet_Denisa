package clase;

public class ComandaTratare implements Comanda{
    private Medic medic;
    private Pacient p;

    public ComandaTratare(Medic medic, Pacient p) {
        this.medic = medic;
        this.p = p;
    }

    @Override
    public void executa() {
        System.out.println("Comanda de tratatre:");
        medic.preiapacient(p);
    }

}
