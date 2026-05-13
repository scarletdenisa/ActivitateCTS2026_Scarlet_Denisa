package clase;

public class Autobuz extends Modul{
    @Override
    public void recomandaTransport(Calator c) {
        if (c.getDistanta()>3 && c.getDistanta()<=5)
            System.out.println("Calatorul "+c.getNume()+
                    " ii este recomandat sa ia autobuzul");
        else
            super.getModulUrmator().recomandaTransport(c);
    }
}
