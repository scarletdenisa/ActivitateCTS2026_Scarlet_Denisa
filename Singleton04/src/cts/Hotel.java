package cts;

public class Hotel {
    private String numeHotel;
    private int numarCamere;
    private int numarCamereOcupate;

    private Hotel(String numeHotel, int numarCamereOcupate, int numarCamere) {
        this.numeHotel = numeHotel;
        this.numarCamereOcupate = numarCamereOcupate;
        this.numarCamere = numarCamere;
    }

    private static Hotel instance=null;

    public static synchronized Hotel getInstance (String numeHotel, int numarCamereOcupate, int numarCamere){
        if(instance==null){
            instance=new Hotel(numeHotel,numarCamereOcupate,numarCamere);
        }
        return instance;
    }

    public void afiseazaDescriere(){
        StringBuilder sb=new StringBuilder();
        sb.append("Hotelul ").append(this.numeHotel);
        sb.append(" are nr. camere=").append(this.numarCamere);
        sb.append(" si nr. camere ocupate=").append(this.numarCamereOcupate);
        System.out.println(sb.toString());
    }

    public void rezervaCamera(){
        if(this.numarCamere>this.numarCamereOcupate){
            System.out.println("Camera a fost rezervata");
            numarCamereOcupate++;
        }else {
            System.out.println("Nu mai sunt camere disponibile");
        }
    }

}
