package clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura{
    private String numedepartament;
    private List<Structura> substructuri;

    public Departament(String numedepartament) {
        this.numedepartament = numedepartament;
        this.substructuri=new ArrayList<>();
    }

    public void adauga(Structura s){
        substructuri.add(s);
    }

    public void sterge(Structura s){
        substructuri.remove(s);
    }

    public Structura getStructura(int pozitie){
        return substructuri.get(pozitie);
    }

    @Override
    public void afiseazaStructura(String spatii) {
        System.out.println(spatii+"Departamentul "+this.numedepartament);
        for (Structura s :substructuri){
            s.afiseazaStructura(spatii+" ");
        }
    }
}
