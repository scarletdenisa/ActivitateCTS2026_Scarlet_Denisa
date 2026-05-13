package clase;

public abstract class Decorator implements INotaDePlata{
    private INotaDePlata nota;

    public Decorator(INotaDePlata nota) {
        this.nota = nota;
    }

    @Override
    public void printeazaNota() {
        nota.printeazaNota();
    }
}
