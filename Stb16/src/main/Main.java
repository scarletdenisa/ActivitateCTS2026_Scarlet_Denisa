package main;

import clase.Autobuz;
import clase.Comanda;
import clase.Operator;
import clase.Plecare;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Autobuz a1=new Autobuz("Mercedes",4);
        Operator op=new Operator("Ion");

        Comanda c1=new Plecare(a1,3);
        Comanda c2=new Plecare(a1,4);

        op.adauga(c1);
        op.adauga(c2);

        op.invoca();
        op.invoca();
    }
}