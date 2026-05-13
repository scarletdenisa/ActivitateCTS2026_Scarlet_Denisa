package clase;

public class Calator {
    private String nume;
    private ModPlata plata;

    public Calator(String nume) {
        this.nume = nume;
        this.plata=new PlataCardCalatorii();
    }

    public void setPlata(ModPlata plata) {
        this.plata = plata;
    }

    public void plateste(int suma){
        plata.afiseazadetaliiPlata(this.nume,suma);
    }
}
