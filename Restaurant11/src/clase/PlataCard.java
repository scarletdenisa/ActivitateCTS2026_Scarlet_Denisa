package clase;

public class PlataCard implements ModPlata{
    @Override
    public void afiseazadetaliiPlata(String nume, double suma) {
        System.out.println("clientul "+nume+" plateste card suma "+suma);
    }
}
