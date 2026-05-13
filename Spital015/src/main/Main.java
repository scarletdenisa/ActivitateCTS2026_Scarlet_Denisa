package main;

import clase.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Operator operator=new Operator("Marcel");

        Medic medic=new Medic("Laurentiu");
        Comanda intern=new ComandaInternare(1,medic);
        Comanda trat=new ComandaTratare(2,medic);

        operator.adaugaComenzi(intern);
        operator.adaugaComenzi(trat);
        operator.invoca();
        operator.invoca();
    }
}