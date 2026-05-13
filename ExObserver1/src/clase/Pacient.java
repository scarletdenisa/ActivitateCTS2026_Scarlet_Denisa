package clase;

public class Pacient implements Ipacient{
    private String nume;

    public Pacient(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Pacientul "+this.nume+" a primit mesajul "+
                mesaj);
    }
}
