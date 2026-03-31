package cts.prototype;

public class Rezervare implements IRezervare {

    protected int cod;
    protected int nrPersoane;
    protected String nume;
    protected int ora;
    protected String numarCard;

    private Rezervare(){

    }

    public int getCod() {
        return cod;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public String getNume() {
        return nume;
    }

    public int getOra() {
        return ora;
    }

    public String getNumarCard() {
        return numarCard;
    }

    public Rezervare(int cod, int nrPersoane, String nume, int ora, String numarCard) {
        this.cod = cod;
        this.nrPersoane = nrPersoane;
        this.nume = nume;
        if(ora>=9 && ora<=22)
            this.ora=ora;
        else
            this.ora=9;
        if(numarCard.length()==5){
            this.numarCard=numarCard;
        }else{
            this.numarCard="00000";
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("cod=").append(cod);
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", ora=").append(ora);
        sb.append(", numarCard='").append(numarCard).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public IRezervare copiere() {
        Rezervare rezervare=new Rezervare();
        rezervare.cod=this.cod;
        rezervare.ora=this.ora;
        rezervare.numarCard=this.numarCard;
        rezervare.nume=this.nume;
        rezervare.nrPersoane=this.nrPersoane;
        return rezervare;
    }
}
