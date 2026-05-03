package clase;

public class Client implements InterfataClient{

    private String nume;
    private String nrTel;
    private String adresa;

    public Client(String adresa, String nume, String nrTel) {
        this.adresa = adresa;
        this.nume = nume;
        this.nrTel = nrTel;
    }

    @Override
    public void afiseazaRezervare(Rezervare rezervare) {
        StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume);
        sb.append(", nrTel='").append(nrTel);
        sb.append(", adresa='").append(adresa);
        sb.append("} are:");
        System.out.println(sb.toString()+rezervare.toString());
    }

    @Override
    public void platesteNota(Rezervare rezervare, double taxaPerPers) {
        System.out.println(this.nume+" plateste "+rezervare.getNrPersonae()*taxaPerPers);
    }
}
