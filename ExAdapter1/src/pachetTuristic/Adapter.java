package pachetTuristic;

import inchiriereMasina.MasinaInchiriata;

public class Adapter implements PachetTuristic{
    private MasinaInchiriata masinaInchiriata;
    @Override
    public void afiseazaDescriere() {
        System.out.println("Pachetul include si masina");
    }

    public Adapter(MasinaInchiriata masinaInchiriata) {
        this.masinaInchiriata = masinaInchiriata;
    }

    @Override
    public void rezervaPachet() {

        masinaInchiriata.inchiriazaMasina();
    }
}
