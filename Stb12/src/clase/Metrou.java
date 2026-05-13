package clase;

public class Metrou extends Modul{
    @Override
    public void recomandaTransport(Calator c) {
        if (c.getDistanta() > 10)
            System.out.println("Calatorul " + c.getNume() +
                    " ii este recomandat sa ia metroul");
    }
}
