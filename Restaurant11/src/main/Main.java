package main;

import clase.Client;
import clase.ModPlata;
import clase.PlataCash;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Client c1=new Client("Ione");
        ModPlata cash=new PlataCash();

        c1.plateste(100);
        c1.setPlata(cash);
        c1.plateste(30);
    }
}