package clase;

public class Pacient {
    private String nume;
    private ModulPlata plata;

    public Pacient(String nume) {
        this.nume = nume;
        this.plata = new PlataCard();
    }

    public void setPlata(ModulPlata plata) {
        this.plata = plata;
    }

    public void plateste(int suma){
        plata.afiseazaDetalii(this.nume,suma);
    }
}
