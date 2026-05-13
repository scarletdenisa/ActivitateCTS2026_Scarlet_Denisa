package main;

import clase.ModulPlata;
import clase.Pacient;
import clase.PlataCash;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pacient p=new Pacient("Ion");
        ModulPlata cash=new PlataCash();

        p.plateste(30);
        p.setPlata(cash);
        p.plateste(80);
    }
}