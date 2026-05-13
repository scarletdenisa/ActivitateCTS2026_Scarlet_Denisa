package clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISpital{
    private String nume;
    private List<Ipacient> pacienti;

    public Spital(String nume) {
        this.nume = nume;
        this.pacienti=new ArrayList<>();
    }

    @Override
    public void notificaPacient(String mesaj) {
        for (Ipacient p:pacienti)
            p.primesteNotificare(mesaj+" de la spitalul "+
                    this.nume);
    }

    @Override
    public void abonare(Ipacient p) {
        pacienti.add(p);
    }

    @Override
    public void dezabonare(Ipacient p) {
        pacienti.remove(p);
    }

    public void apareEpidemie(){
        notificaPacient("a aparut o epidemie");
    }

    public void apareVirus(){
        notificaPacient("a aparut un virus");
    }
}
