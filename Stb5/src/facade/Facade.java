package facade;

import clase.Usa;
import clase.UsaFata;
import clase.UsaMijloc;
import clase.UsaSpate;

public class Facade {
    private void deschidere(){
        Usa fata=new UsaFata();
        Usa mijloc=new UsaMijloc();
        Usa spate=new UsaSpate();
        fata.deschideUsa();
        mijloc.deschideUsa();
        spate.deschideUsa();
    }

    public void deschideLiber(){
        System.out.println("Usile au fost deschide in mode liber:");
        deschidere();
    }

    public void deschideFortat(){
        System.out.println("Usile au fost deschise in mode fortat:");
        deschidere();
    }
}
