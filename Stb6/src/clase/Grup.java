package clase;

import java.util.ArrayList;
import java.util.List;

public class Grup implements Structura{
    private String nume;
    private List<Structura> lista;

    public Grup(String nume) {
        this.nume = nume;
        this.lista=new ArrayList<>();
    }


    public void adauga(Structura s){
        if (s instanceof Autobuz){
            Autobuz a=(Autobuz) s;
            if(this.nume.equals("Grup mic")&&
                    a.getNrLocuri()<=10){
                lista.add(a);
            }
            else
                if (this.nume.equals("Grup mediu")&&
                        a.getNrLocuri()>10 &&
                        a.getNrLocuri()<=30){
                    lista.add(a);
                }else
                    if (this.nume.equals("Grup mare")&&
                            a.getNrLocuri()>30 &&
                            a.getNrLocuri()<=50){
                        lista.add(a);
                    }


        }
    }

    public void sterge(Structura s){
        lista.remove(s);
    }

    public Structura getPozitie(int poz){
        return lista.get(poz);
    }

    @Override
    public void afiseazaStructura(String spatii) {
        System.out.println(spatii+this.nume);
        for(Structura s:lista)
            s.afiseazaStructura(spatii+" ");
    }
}
