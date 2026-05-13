package clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private String nume;
    private List<Comanda> comenzi;

    public Operator(String nume) {
        this.nume = nume;
        this.comenzi=new ArrayList<>();
    }

    public void adauga(Comanda c){
        comenzi.add(c);
    }

    public void sterge(Comanda c){
        comenzi.remove(c);
    }

    public void invoca(){
        if(comenzi.size()!=0){
            comenzi.get(0).daComanda();
            comenzi.remove(0);
        }else
            System.out.println("nu sunt comenzi");
    }
}
