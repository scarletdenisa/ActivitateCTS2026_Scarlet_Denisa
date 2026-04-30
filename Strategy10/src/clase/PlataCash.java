package clase;

public class PlataCash implements ModalitateaDePlata{
    @Override
    public void plateste(String nume, double suma) {
        System.out.println("Clientul "+nume+" plateste "+suma+" cash");
    }
}
