package decorator;

import clase.IBilet;

public abstract class Decorator implements IBilet {
    private IBilet bilet;

    public Decorator(IBilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void printeazaBilet() {
        bilet.printeazaBilet();
    }

    public abstract void adaugaMesaj();
}
