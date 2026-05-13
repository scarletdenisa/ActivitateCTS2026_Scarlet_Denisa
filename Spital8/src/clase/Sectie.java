package clase;

public class Sectie implements Structura{
    private int nrangajati;
    private String nume;

    public Sectie(int nrangajati, String nume) {
        this.nrangajati = nrangajati;
        this.nume = nume;
    }

    @Override
    public void afiseazaStructura(String spatii) {
        System.out.println(spatii+"Sectia "+this.nume+" are "+
                this.nrangajati+" angajati");
    }
}
