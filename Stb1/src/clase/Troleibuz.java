package clase;

public class Troleibuz extends MijlocTransport{
    public Troleibuz(int nrRoti, String nrImatriculare, boolean esteFunctional) {
        super(nrRoti, nrImatriculare, esteFunctional);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Troleibuzul are roti="+super.nrRoti+
                " nrImatriculare="+super.nrImatriculare+
                " esteFunctional="+super.esteFunctional);
    }
}
