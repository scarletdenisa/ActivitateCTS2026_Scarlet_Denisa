package decorator;

import clase.INotaPlata;

public class Decorator1Mai extends DecoratorNotaPlata{
    public Decorator1Mai(INotaPlata nota) {
        super(nota);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("1 Mai fericit!");
    }
}
