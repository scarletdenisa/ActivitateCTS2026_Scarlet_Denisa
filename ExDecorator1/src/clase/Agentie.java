package clase;

public class Agentie implements IAgentie{

    private String nume;

    public Agentie(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaPachet() {
        System.out.println("Agentia "+this.nume+" ofera pachete turistice");
    }
}
