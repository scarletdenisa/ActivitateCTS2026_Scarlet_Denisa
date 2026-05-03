package main;

import clase.InterfataSpital;
import clase.Pacient;
import clase.Spital;
import proxy.Proxy;


public class Main {
    public static void main(String[] args) {

        InterfataSpital spital=new Spital("Constantin");
        Pacient p1=new Pacient("Alex",true);
        Pacient p2=new Pacient("Ioana",false);

        Proxy proxy=new Proxy(spital);
        proxy.interneazaPacient(p1);
        proxy.interneazaPacient(p2);
    }
}