package main;

import clase.Autobuz;
import clase.Grup;
import clase.Structura;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Structura bus1=new Autobuz("Mercedes","A8",5);
        Structura bus2=new Autobuz("Aydu","A18",10);
        Structura bus3=new Autobuz("Mercedes","A8",25);
        Structura bus4=new Autobuz("Mercedes","A8",50);

        Structura grupMare=new Grup("Grup mare");
        Structura grupMed=new Grup("Grup mediu");
        Structura grupMic=new Grup("Grup mic");

        ((Grup)grupMare).adauga(bus1);
        ((Grup)grupMare).adauga(bus2);
        ((Grup)grupMare).adauga(bus3);
        ((Grup)grupMare).adauga(bus4);

        ((Grup)grupMed).adauga(bus1);
        ((Grup)grupMed).adauga(bus2);
        ((Grup)grupMed).adauga(bus3);
        ((Grup)grupMed).adauga(bus4);

        ((Grup)grupMic).adauga(bus1);
        ((Grup)grupMic).adauga(bus2);
        ((Grup)grupMic).adauga(bus3);
        ((Grup)grupMic).adauga(bus4);

        grupMare.afiseazaStructura("");
        grupMic.afiseazaStructura("");
        grupMed.afiseazaStructura("");
    }
}