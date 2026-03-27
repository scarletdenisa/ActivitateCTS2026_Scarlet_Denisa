package cts.clasa;

public class Hotel {
    private String nume;
    private int nrCamere;
    private int nrCamereOcupate;

    private Hotel(String nume, int nrCamere, int nrCamereOcupate) {
        this.nume = nume;
        this.nrCamere = nrCamere;
        this.nrCamereOcupate = nrCamereOcupate;
    }

    private static Hotel instanta=null;

    public static synchronized Hotel getInstance(String nume, int nrCamere, int nrCamereOcupate){
        if(instanta==null)
            instanta=new Hotel(nume, nrCamere, nrCamereOcupate);
        return instanta;
    }

    public void afiseazaDescriere(){
        StringBuilder sb = new StringBuilder("Hotel: ");
        sb.append("nume='").append(nume);
        sb.append(", nrCamere=").append(nrCamere);
        sb.append(", nrCamereOcupate='").append(nrCamereOcupate).append('\'');
        System.out.println(sb.toString());
    }

    public void rezervaCamera(){
        if(this.nrCamere>this.nrCamereOcupate) {
            System.out.println("S-a realizat rezervarea");
            nrCamereOcupate++;
        }
        else
            System.out.println("Nu sunt camere disponibile");
    }


}
