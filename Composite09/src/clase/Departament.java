package clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura{
    private String numeDepartament;
    private List<Structura> listaSubStructuri;

    public Departament(String numeDepartament ) {
        this.numeDepartament = numeDepartament;
        this.listaSubStructuri = new ArrayList<>();
    }

    public void adaugaSTructura(Structura structura){
        listaSubStructuri.add(structura);
    }

    public void stergeStructura(Structura structura){
        listaSubStructuri.remove(structura);
    }

    public Structura getStructura(int pozitie){
        return listaSubStructuri.get(pozitie);
    }

    @Override
    public void afiseazaDetaliiStructura(String spatii) {

        System.out.println(spatii+" nume departament: "+
                this.numeDepartament);
        for (Structura s :listaSubStructuri){
            s.afiseazaDetaliiStructura(spatii+" ");
        }
    }
}
