package clase;

public class Client {
    private String nume;
    private ModPlata plata;

    public Client(String nume) {
        this.nume = nume;
        this.plata=new PlataCard();
    }

    public void setPlata(ModPlata plata) {
        this.plata = plata;
    }

    public void plateste(double suma){
        plata.afiseazadetaliiPlata(this.nume,suma);
    }
}
