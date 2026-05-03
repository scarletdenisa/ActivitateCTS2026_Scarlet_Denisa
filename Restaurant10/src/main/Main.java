package main;

import clase.Client;
import clase.FabricaClient;
import clase.InterfataClient;
import clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        FabricaClient fabrica=new FabricaClient();

        InterfataClient c1= fabrica.getClient("alex@gmail", "alex", "09723647");
        InterfataClient c2= fabrica.getClient("ana@yahoo", "ana", "89879877");

        Rezervare r1=new Rezervare(3,"21:30",6);
        Rezervare r2=new Rezervare(1,"12:00",2);

        c1.afiseazaRezervare(r1);
        c2.afiseazaRezervare(r2);
        c1.afiseazaRezervare(r2);

        c1.platesteNota(r1,200);
        c2.platesteNota(r1,100);
    }
}