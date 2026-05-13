package clase;

public class Proxy implements IPachetTuristic{

    private PachetTuristic pachet;

    @Override
    public void afiseazadetalii() {
        pachet.afiseazadetalii();
    }

    public Proxy(PachetTuristic pachet) {
        this.pachet = pachet;
    }

    @Override
    public void rezrvaPachet() {
        if (pachet.getPersoana().getVarsta()>=65){
            System.out.println("Persoana "+pachet.getPersoana().getNume()+
                    " cu varsta "+pachet.getPersoana()
                    .getVarsta()+" a rezervat pachetul");

        }else
            System.out.println("persoana nu are varsta care trebuie");
    }
}
