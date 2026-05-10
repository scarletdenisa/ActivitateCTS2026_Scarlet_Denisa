package clase;

public class Autobuz implements Structura{
    private String producator;
    private String model;
    private int nrLocuri;

    public Autobuz(String producator, String model, int nrLocuri) {
        this.producator = producator;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    @Override
    public void afiseazaStructura(String spatii) {
        System.out.println(spatii+"Autobuzul "+this.producator+" "+
                this.model+" are "+this.nrLocuri+" locuri");
    }
}
