package clase;

public class PlataCash implements ModPlata{
    @Override
    public void afiseazadetaliiPlata(String nume, double suma) {
        System.out.println("clientul "+nume+" plateste cash suma "+suma);
}}
