package clase;

public class Spital implements ISpital{
    private String nume;

    public Spital(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaInternare(Persoana p) {
        System.out.println("spitalul "+this.nume+" a internat "+
                p.toString());
    }
}
