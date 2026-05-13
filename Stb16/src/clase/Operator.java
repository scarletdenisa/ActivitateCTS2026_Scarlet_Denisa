package clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Comanda> comenzi;
    private String nume;

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
            comenzi.get(0).pleacaInCursa();
            comenzi.remove(0);
        }
        else System.out.println("nu mai sunt comenzi");
    }
}
