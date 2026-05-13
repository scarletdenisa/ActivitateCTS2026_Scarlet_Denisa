package clase;

public class NonUe implements Verificare{
    @Override
    public void afisareDetaliiVeridicare(String nume) {
        System.out.println("Cetateanul "+nume+" este european Non UE si a fost controlat si scanat pasaportul");
    }
}
