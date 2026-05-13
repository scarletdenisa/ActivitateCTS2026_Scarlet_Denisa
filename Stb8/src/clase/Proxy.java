package clase;

public class Proxy implements IOprire{
    private Oprire oprire;

    public Proxy(Oprire oprire) {
        this.oprire = oprire;
    }

    @Override
    public void opresteInStatie() {
        if(oprire.getAutobuz().getNrPasageri()>=1)
            oprire.opresteInStatie();
        else
            System.out.println("Autobuzul nu are calatori si se retrage la autobaza");
    }
}
