package clase;

public class Autobuz extends MijlocTransport{
    public Autobuz(int nrRoti, String nrImatriculare, boolean esteFunctional) {
        super(nrRoti, nrImatriculare, esteFunctional);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Autobuzul are roti="+super.nrRoti+
                " nrImatriculare="+super.nrImatriculare+
                " esteFunctional="+super.esteFunctional);
    }
}
