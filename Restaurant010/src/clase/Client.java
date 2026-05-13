package clase;

public class Client implements IClient{
    private String nume;
    private String tel;
    private String adresa;

    public Client(String nume, String tel, String adresa) {
        this.nume = nume;
        this.tel = tel;
        this.adresa = adresa;
    }

    @Override
    public void afiseazDetalii(Rezervare rezervare) {
        System.out.println("Clientul "+this.nume+" cu tel="+this.tel+
                " si mail="+this.adresa+" a facut rezervarea "+
                rezervare.toString());
    }
}
