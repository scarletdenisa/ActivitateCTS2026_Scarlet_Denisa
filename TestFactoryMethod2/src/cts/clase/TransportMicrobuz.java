package cts.clase;

public class TransportMicrobuz extends Transport{
    public TransportMicrobuz(int nrRoti, String nrImatriculare) {
        super(nrRoti, nrImatriculare);
    }


        @Override
        public void afiseazaDescriere() {
            System.out.println("Microbuzul are roti="+super.nrRoti+
                    " si nrImatriculare="+super.nrImatriculare);
        }

}
