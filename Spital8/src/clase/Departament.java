package clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura{
    private String numeDep;
    private List<Structura> lista;

    public Departament(String numedep) {
        this.numeDep = numedep;
        lista=new ArrayList<>();
    }

    @Override
    public void afiseazaStructura(String spatii) {
        System.out.println(spatii+"Departamentul este "+this.numeDep);
        for (Structura s:lista)
            s.afiseazaStructura(spatii+" ");
    }

    public void adaugaNod(Structura s){
        lista.add(s);
    }

    public void stergeNod(Structura s){
        lista.remove(s);
    }

    public Structura getNod(int poz){
        return lista.get(poz);
    }
}
