package main;

import clase.IPersoana;
import clase.Persoana;
import clase.Spital;
import clase.SpitalConcret;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IPersoana p1=new Persoana("Aurel");
        IPersoana p2=new Persoana("Maria");

        Spital spital=new SpitalConcret("Spital");

        spital.aboneaza(p1);
        spital.aboneaza(p2);
        ((SpitalConcret)spital).apareVirus();
        ((SpitalConcret)spital).apareEpidemie();
    }
}