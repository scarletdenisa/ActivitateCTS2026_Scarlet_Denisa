package clase;

public class PlataSms implements ModPlata{
    @Override
    public void afiseazadetaliiPlata(String nume, int suma) {
        System.out.println("Calatorul "+nume+" plateste suma de "+
                suma+" prin sms");
    }
}
