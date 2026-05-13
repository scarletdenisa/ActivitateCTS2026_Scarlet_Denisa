package clase;

public class PlataCash implements ModulPlata{
    @Override
    public void afiseazaDetalii(String pacient,int suma) {
        System.out.println("Pacientul "+pacient+
                " a platit cash suma "+suma);
    }
}
