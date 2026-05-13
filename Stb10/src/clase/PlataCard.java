package clase;

public class PlataCard implements ModPlata{
    @Override
    public void afiseazadetaliiPlata(String nume, int suma) {
        System.out.println("Calatorul "+nume+" plateste suma de "+
                suma+" cu cardul bancar");
    }
}
