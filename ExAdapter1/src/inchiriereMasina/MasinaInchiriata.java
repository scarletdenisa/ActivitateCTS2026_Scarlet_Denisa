package inchiriereMasina;

public class MasinaInchiriata {
    Masina masina;

    public MasinaInchiriata(Masina masina) {
        this.masina = masina;
    }

    public void inchiriazaMasina(){
        System.out.println("Masina a fost inchiriata");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MasinaInchiriata{");
        sb.append("masina=").append(masina);
        sb.append('}');
        return sb.toString();
    }
}
