package main;

import clase.AplicatieAutobuz;
import clase.Autobuz;
import clase.Calator;
import clase.ICalator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ICalator cal1=new Calator("Alex");
        ICalator cal2=new Calator("Maria");

        AplicatieAutobuz apl=new Autobuz("B100AAA");

        apl.aboneaza(cal1);
        apl.aboneaza(cal1);

        ((Autobuz)apl).pleacaautobuz();

        apl.dezaboneaza(cal1);
        ((Autobuz)apl).pleacaautobuz();
    }
}