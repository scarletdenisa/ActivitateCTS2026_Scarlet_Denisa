package clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private String nume;
    private List<Comanda> lista;

    public Operator(String nume) {
        this.nume = nume;
        this.lista=new ArrayList<>();
    }

    public void adaugaComenzi(Comanda c){
        lista.add(c);
    }

    public void stergeComenzi(Comanda c){
        lista.remove(c);
    }

    public void invoca(){
        if(lista.size()!=0){
            lista.get(0).daComenzi();
            lista.remove(0);
        }else System.out.println("nu mai sunt comenzi in lista");
    }
}
