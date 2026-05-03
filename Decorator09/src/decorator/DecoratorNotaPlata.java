package decorator;

import clase.INotaPlata;

public abstract class DecoratorNotaPlata implements INotaPlata {

    private INotaPlata nota;

    public DecoratorNotaPlata(INotaPlata nota) {
        this.nota = nota;
    }

    @Override
    public void printeaza() {
        nota.printeaza();
    }

    public abstract void printeazaFelicitare();
}
