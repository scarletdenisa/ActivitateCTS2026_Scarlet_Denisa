package clase;

public class Troleibuz extends Modul{
    @Override
    public void recomandaTransport(Calator c) {
        if (c.getDistanta()<=3)
            System.out.println("Calatorul "+c.getNume()+
                    " ii este recomandat sa ia troleibuzul");
        else
            super.getModulUrmator().recomandaTransport(c);
    }
}
