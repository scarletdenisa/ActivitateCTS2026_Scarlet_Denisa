package clase;

public class DecoratorLaMultiAni extends Decorator{
    public DecoratorLaMultiAni(INotaDePlata nota) {
        super(nota);
    }

    @Override
    public void printeazaNota() {
        super.printeazaNota();
        System.out.println("La multi ani!");
    }
}
