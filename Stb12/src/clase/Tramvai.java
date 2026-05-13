package clase;

public class Tramvai extends Modul{
    @Override
    public void recomandaTransport(Calator c) {
        if (c.getDistanta()>5 && c.getDistanta()<=10)
            System.out.println("Calatorul "+c.getNume()+
                    " ii este recomandat sa ia tramvaiul");
        else
            super.getModulUrmator().recomandaTransport(c);
    }
}
