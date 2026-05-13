package main;

import clase.IPachetTuristic;
import clase.PachetTuristic;
import clase.Persoana;
import clase.Proxy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Persoana pers1=new Persoana("Aurel",67);
        Persoana pers2=new Persoana("Alexandra",12);

        PachetTuristic pac1=new PachetTuristic(pers1);
        PachetTuristic pac2=new PachetTuristic(pers2);

        Proxy proxy=new Proxy(pac2);
        proxy.rezrvaPachet();
        Proxy proxy1=new Proxy(pac1);
        proxy1.rezrvaPachet();
        proxy.afiseazadetalii();
        proxy1.afiseazadetalii();
    }
}