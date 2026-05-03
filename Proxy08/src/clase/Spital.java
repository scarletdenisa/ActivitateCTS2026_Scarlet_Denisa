package clase;

public class Spital implements InterfataSpital{
    private String nume;

    public Spital(String nume) {
        this.nume = nume;
    }

    @Override
    public void interneazaPacient(Pacient pacient) {
        System.out.println(pacient.toString()+" este internat in spitalul "+
                this.nume);
    }
}
