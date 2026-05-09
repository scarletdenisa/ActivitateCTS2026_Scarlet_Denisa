package clase;

public class SoftAgentie implements PachetTuristic{
    private String nume;
    private int an;

    public SoftAgentie(String nume, int an) {
        this.nume = nume;
        this.an = an;
    }

    private void descrierePachet(){
        System.out.println(areSoftulDeMasini()?"Agentia "+nume+" ofera pachet de cazare si transport":
                "Agentia "+nume+" ofera pachet de cazare si transport si masina");

    }

    private boolean areSoftulDeMasini(){
        if (an>=2008)
            return true;
        else
            return false;
    }

    @Override
    public void rezervaPachet() {
        descrierePachet();
        System.out.println("si s a rezrvat");
    }
}
