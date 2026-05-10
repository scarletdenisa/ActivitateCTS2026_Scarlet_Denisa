package clase;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements Structura{
    private String nume;
    private List<Structura> lista;

    public Categorie(String nume) {
        this.nume = nume;
        this.lista=new ArrayList<>();
    }

    public void adauga(Structura s){
        lista.add(s);
    }

    public void strge(Structura s){
        lista.remove(s);
    }

    public Structura getStructura(int poz){
        return lista.get(poz);
    }

    @Override
    public void afiseazaStructura(String spatii) {
        System.out.println(spatii+"Categoria "+this.nume);
        for (Structura s:lista)
            s.afiseazaStructura(spatii+" ");
    }
}
