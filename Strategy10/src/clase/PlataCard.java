package clase;

public class PlataCard implements ModalitateaDePlata{

    @Override
    public void plateste(String nume, double suma) {
        System.out.println("Clientul "+nume+" plateste "+suma+" card");
    }
}
