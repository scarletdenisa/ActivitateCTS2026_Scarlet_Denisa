package clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private String nume;
    private List<Comanda> lista;
    private Masa masa;

    public Operator(String nume) {
        this.nume = nume;
        this.lista=new ArrayList<>();
    }

    public void adaugaComanezi(Comanda c){
        lista.add(c);
    }

    public void stergeComanda(Comanda C){
        lista.remove(C);
    }

    public void invoca(){
        if(lista.size()!=0){
            lista.get(0).rezervaMasa();
            lista.remove(0);
        }else System.out.println("lista e goala");
    }
}
