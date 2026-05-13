package clase;

public class Pacient implements IPacient{
    private String nume;
    private String tel;
    private String adresa;
    private Spitalizare spitalizare;

    public Pacient(String nume, String tel, String adresa) {
        this.nume = nume;
        this.tel = tel;
        this.adresa = adresa;
        this.spitalizare=new Spitalizare();
    }

    @Override
    public void afiseaza(Spitalizare spitalizare) {
        System.out.println("clientul "+this.nume+" ,tel="+this.tel+
                " si adresa="+this.adresa+" a fost internat la "+spitalizare.toString());
    }
}
