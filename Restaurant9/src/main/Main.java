package main;

import clase.IRezervare;
import clase.Proxy;
import clase.Rezervare;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IRezervare rez=new Rezervare(6,"12:00","12.09");
        Proxy proxy=new Proxy(rez);
        proxy.afiseazaRezervare();
    }
}