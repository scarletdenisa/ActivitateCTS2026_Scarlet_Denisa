package main;

import clase.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Operator operator=new Operator("Ionel");

        Pacient p1=new Pacient("Dpru",83);
        Pacient p2=new Pacient("Maria",12);

        Medic medic=new Medic("Medicu");
        Comanda c1=new ComandaInternare(medic,p1);
        Comanda c2=new ComandaTratare(medic,p2);

        operator.adaugaComanda(c1);
        operator.adaugaComanda(c2);

        operator.invoca();
        operator.invoca();
    }
}