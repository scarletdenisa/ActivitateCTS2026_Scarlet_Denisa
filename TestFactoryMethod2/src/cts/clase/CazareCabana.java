package cts.clase;

public class CazareCabana extends Cazare{
    public CazareCabana(String adresa, int camere) {
        super(adresa, camere);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Cabana are adresa="+super.adresa+
                " si camere="+super.camere);
    }
}
