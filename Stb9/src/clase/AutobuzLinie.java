package clase;

public class AutobuzLinie implements IAutobuzLinie {
    private int nrLinie;
    private String primaStatie;
    private String ultimaStatie;

    public AutobuzLinie(int nrLinie, String primaStatie, String ultimaStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public void afiseazaDetaliiAutobuz(State state) {

        System.out.println(state.toString()+" Circula pe linia "+
                this.nrLinie+", prima statie="+this.primaStatie+
                " si ultima statie="+this.ultimaStatie);
    }
}
