package MAIN;

import clase.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Executant cazare=new PachetCazare(12);
        Executant transport=new PachetTransport("Roma");

        Comanda rezervare=new ComandaRezervare(cazare);
        Comanda vanzare=new ComandaVanzare(transport);

        Operator operator=new Operator("Ion");

        operator.adauga(rezervare);
        operator.adauga(vanzare);
        operator.invoca();
        operator.invoca();
    }
}