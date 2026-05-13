package clase;

import java.util.ArrayList;
import java.util.List;

public class SpitalConcret implements Spital{
    private String nume;
    private List<IPersoana> lista;

    public SpitalConcret(String nume) {
        this.nume = nume;
        this.lista=new ArrayList<>();
    }

    @Override
    public void aboneaza(IPersoana persoana) {
        lista.add(persoana);
    }

    @Override
    public void dezaboneaza(IPersoana persoana) {
        lista.remove(persoana);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for (IPersoana p:lista){
            System.out.println(" de la spitalul "+this.nume);
            p.primesteNotificare(mesaj);
        }
    }

    public void apareEpidemie(){
        trimiteNotificare("A aparut o epidemie");
    }

    public void apareVirus(){
        trimiteNotificare("A aparut un virus");
    }
}
