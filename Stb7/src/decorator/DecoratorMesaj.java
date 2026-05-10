package decorator;

import clase.IBilet;

public class DecoratorMesaj extends Decorator{
    public DecoratorMesaj(IBilet bilet) {
        super(bilet);
    }

    @Override
    public void adaugaMesaj() {
        super.printeazaBilet();
        System.out.println("La multi ani!");
    }
}
