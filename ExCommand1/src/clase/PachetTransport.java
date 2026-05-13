package clase;

public class PachetTransport implements Executant{
    private String destinatie;

    public PachetTransport(String destinatie) {
        this.destinatie = destinatie;
    }

    @Override
    public void afiseaza() {
        System.out.println("Pachetul de transport la destinatia "+this.destinatie+
                " a fost comandat");
    }

}
