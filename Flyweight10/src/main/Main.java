package main;

import clase.Client;
import clase.ClientAbstract;
import clase.FabricaClienti;
import clase.Rezervare;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FabricaClienti fabricaClienti=new FabricaClienti();

        ClientAbstract c1= fabricaClienti.getClient("Alex","alex@gmail.com","0726541");
        ClientAbstract c2= fabricaClienti.getClient("Daria","daria@gmail.com","0999991");
        ClientAbstract c3= fabricaClienti.getClient("Iulia","iulia@yahoo.com","0726546252");

        Rezervare rezervare=new Rezervare(2,"23:30",2);
        Rezervare rezervare1=new Rezervare(6,"14",10);

        c1.afiseazaRezervare(rezervare);
        c2.afiseazaRezervare(rezervare);
        c3.afiseazaRezervare(rezervare1);

        c1.realizeazaPlata(rezervare,10);
    }
}