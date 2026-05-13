package clase;

public class Persoana implements IPersoana{
    private String nume;

    public Persoana(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Persoana "+this.nume+ " primeste notificarea "+
                mesaj);
    }
}
