package clase;

public class Agentie implements InterfataAgentie{
    private String nume;

    public Agentie(String nume) {
        this.nume = nume;
    }

    @Override
    public void rezervaPachet(Pensionar pensionar) {
        System.out.println(pensionar.toString()+
                " a rezervat pachetul la agentia "+
                this.nume);
    }
}
