package main;

import clase.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Operator operator=new Operator("Marian");

        Masa masa=new Masa(1);
        Masa masa1=new Masa(2);
        Masa masa2=new Masa(3);

        Comanda rez=new ComandaRezervare(1,masa1);
        Comanda rez2=new ComandaRezervare(2,masa2);
        Comanda oc=new ComandaOcupare(1,masa);

        operator.adaugaComanezi(rez2);
        operator.adaugaComanezi(rez);
        operator.adaugaComanezi(oc);

        operator.invoca();
        operator.invoca();
        operator.invoca();
    }
}