package decorator;

import clase.INotaPlata;

public class DecoratorAnulNou extends DecoratorNotaPlata{
    public DecoratorAnulNou(INotaPlata nota) {
        super(nota);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println(" La multi ani de anul nou!");
    }
}
