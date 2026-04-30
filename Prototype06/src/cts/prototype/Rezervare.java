package cts.prototype;

public class Rezervare implements IRezervare{
    private String nume;
    private int ora;
    private int nrPersoane;
    private String nrCard;

    private Rezervare(){

    }

    public Rezervare(String nume, int ora, int nrPersoane, String nrCard) {
        this.nume = nume;
        if(ora>=11 && ora<=22){
          this.ora = ora;
        }else{
            this.ora=11;
        }
        this.nrPersoane = nrPersoane;
        if(nrCard.length()==16){
          this.nrCard = nrCard;
        }else{
            nrCard="0000000000000000";
        }
    }

    public void setNrCard(String nrCard) {
        this.nrCard = nrCard;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public void setOra(int ora) {
        this.ora = ora;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", ora=").append(ora);
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", nrCard='").append(nrCard).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public IRezervare copiere() {
        Rezervare rezervare=new Rezervare();
        rezervare.nume=this.nume;
        rezervare.ora=this.ora;
        rezervare.nrPersoane=this.nrPersoane;
        rezervare.nrCard=this.nrCard;
        return rezervare;
    }
}
