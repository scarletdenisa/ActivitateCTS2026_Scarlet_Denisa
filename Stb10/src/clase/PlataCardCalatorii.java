package clase;

public class PlataCardCalatorii implements ModPlata{
    @Override
    public void afiseazadetaliiPlata(String nume, int suma) {
        System.out.println("Calatorul "+nume+" plateste suma de "+
                suma+" cu cardul de calatorii");
    }
}
