package main;

import clase.ISpital;
import clase.Persoana;
import clase.Proxy;
import clase.Spital;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ISpital spital=new Spital("Marzescu");
        Persoana pers1=new Persoana("Ion",false);
        Proxy proxy=new Proxy(spital);
        proxy.afiseazaInternare(pers1);
    }
}