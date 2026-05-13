package main;

import clase.Departament;
import clase.Sectie;
import clase.Structura;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Structura depAdm=new Departament("Administratie");
        Structura depFinanciar=new Departament("Financiar");
        Structura politie=new Sectie(20,"politie");
        Structura abc=new Sectie(1,"abc");

        ((Departament)depAdm).adaugaNod(politie);
        ((Departament)depAdm).adaugaNod(abc);
        ((Departament)depAdm).adaugaNod(depFinanciar);
        ((Departament)depFinanciar).adaugaNod(abc);
        depAdm.afiseazaStructura("");
        depFinanciar.afiseazaStructura("");
    }
}