package clase;

public class Pachet implements IPachet{
    private String hotel;
    private String destinatie;
    private boolean micDejun;
    private int cod;

    public Pachet() {

    }

    public Pachet(String hotel, String destinatie, boolean micDejun,int cod) {
        this.hotel = hotel;
        this.destinatie = destinatie;
        this.micDejun = micDejun;
        this.cod=cod;
    }

    public String getHotel() {
        return hotel;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public boolean isMicDejun() {
        return micDejun;
    }

    public int getCod() {
        return cod;
    }

    @Override
    public void descrierePachet(Optional optional) {
        System.out.println("Pachetul "+this.cod+" are hotelul "+this.hotel+
                ", destinatia "+this.destinatie+" si mic dejun "+
                this.micDejun+" si optionalele: "+optional.toString());
    }
}
