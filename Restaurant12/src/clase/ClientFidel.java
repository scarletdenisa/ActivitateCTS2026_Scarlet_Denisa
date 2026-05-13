package clase;

public class ClientFidel implements IClient{
    private String nume;

    public ClientFidel(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Clientul "+this.nume+" primeste mesajul "+mesaj);
    }
}
