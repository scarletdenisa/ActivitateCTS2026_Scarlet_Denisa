package clase;

public class Tranvai extends MijlocTransport{
    public Tranvai(int nrRoti, String nrImatriculare, boolean esteFunctional) {
        super(nrRoti, nrImatriculare, esteFunctional);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Tranvaiul are roti="+super.nrRoti+
                " nrImatriculare="+super.nrImatriculare+
                " esteFunctional="+super.esteFunctional);
    }
}
