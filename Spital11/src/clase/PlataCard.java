package clase;

public class PlataCard implements ModulPlata{
    @Override
    public void afiseazaDetalii(String pacient,int suma) {
        System.out.println("Pacientul "+pacient+
                " a platit card suma "+suma);
    }
}
