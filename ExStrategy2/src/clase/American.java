package clase;

public class American implements Verificare{
    @Override
    public void afisareDetaliiVeridicare(String nume) {
        System.out.println("Cetateanul "+nume+" este american si a fost controlat si scanat viza");
    }
}
