package clase;

public class PachetTuristic implements IPachetTuristic{

    private Persoana persoana;

    public PachetTuristic(Persoana persoana) {
        this.persoana = persoana;
    }

    public void setPersoana(Persoana persoana) {
        this.persoana = persoana;
    }

    public Persoana getPersoana() {
        return persoana;
    }

    @Override
    public void afiseazadetalii() {
        System.out.println("Acest pachet include cazare si transport");
    }

    @Override
    public void rezrvaPachet() {
        System.out.println(persoana.toString()+
                " a rezervat pachetul");
    }
}
