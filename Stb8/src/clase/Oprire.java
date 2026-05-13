package clase;

public class Oprire implements IOprire{
    private Autobuz autobuz;

    public Oprire(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    public Autobuz getAutobuz() {
        return autobuz;
    }

    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul "+autobuz.getNrImatriculare()+
                " cu numarul de calatori de "+autobuz.getNrPasageri()+
                " opreste in statie");
    }
}
