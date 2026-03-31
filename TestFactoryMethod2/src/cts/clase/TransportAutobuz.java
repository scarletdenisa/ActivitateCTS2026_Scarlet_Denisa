package cts.clase;

public class TransportAutobuz extends Transport{
    public TransportAutobuz(int nrRoti, String nrImatriculare) {
        super(nrRoti, nrImatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Autobuzul are roti="+super.nrRoti+
                " si nrImatriculare="+super.nrImatriculare);
    }
}
