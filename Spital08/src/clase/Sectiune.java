package clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Structura{
    private String denumire;
    private List<Structura> lista;

    public Sectiune(String denumire) {
        this.denumire = denumire;
        this.lista=new ArrayList<>();
    }

    @Override
    public void afiseazaStructura(String spatii) {
        System.out.println(spatii+"Sectiunea este "+this.denumire);
        for(Structura s :lista){
            s.afiseazaStructura(spatii+" ");
        }
    }

    public void adaugaNod(Structura s){
        lista.add(s);
    }

    public void stergeNod(Structura s){
        lista.remove(s);
    }

    public Structura getPozitie(int poz){
        return lista.get(poz);
    }
}
