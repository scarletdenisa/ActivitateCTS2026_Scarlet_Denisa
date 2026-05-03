package clase;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements Structura {
    private String nume;
    private List<Structura> lista;

    public Categorie(String nume) {
        this.nume = nume;
        this.lista=new ArrayList<>();
    }


    @Override
    public void afiseazaDescriere(String spatii) {
        System.out.println(spatii+"Categoria "+this.nume);
        for (Structura s:lista){
            s.afiseazaDescriere(spatii+" ");
        }
    }

    public void adaugaStructura(Structura structura){
        lista.add(structura);
    }

    public void stergeStructura(Structura structura){
        lista.remove(structura);
    }

    public Structura getStructura(int pozitie){
       return lista.get(pozitie);
    }
}
