package clase;

public abstract class IDecorareRezultate implements Spital{
    private Spital rezultate;

    public IDecorareRezultate(Spital rezultate) {
        this.rezultate = rezultate;
    }

    @Override
    public void afiseazaRezultate() {
        rezultate.afiseazaRezultate();
    }

}
