package clase;

public class DecorareOnline extends IDecorareRezultate{


    public DecorareOnline(Spital rezultate) {
        super(rezultate);
    }

    @Override
    public void afiseazaRezultate() {
        super.afiseazaRezultate();
        System.out.println("S- au afisat online ");
    }
}
