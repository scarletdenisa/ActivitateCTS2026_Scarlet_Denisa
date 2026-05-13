package main;

import clase.DecorareOnline;
import clase.IDecorareRezultate;
import clase.Rezultate;
import clase.Spital;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Spital rez1=new Rezultate("12.03.2026");
        rez1.afiseazaRezultate();

        IDecorareRezultate decorareRezultate=new DecorareOnline(rez1);
        decorareRezultate.afiseazaRezultate();
    }
}