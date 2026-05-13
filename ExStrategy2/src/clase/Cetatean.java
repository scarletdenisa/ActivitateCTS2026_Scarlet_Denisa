package clase;

public class Cetatean {
    private String nume;
    private Verificare verificare;

    public Cetatean(String nume) {
        this.nume = nume;
        this.verificare=new Ue();
    }

    public void setVerificare(Verificare verificare) {
        this.verificare = verificare;
    }

    public void verifica(){
        verificare.afisareDetaliiVeridicare(this.nume);
    }
}
