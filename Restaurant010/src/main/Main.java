package main;

import clase.Client;
import clase.FabricaClient;
import clase.IClient;
import clase.Rezervare;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rezervare rezervare=new Rezervare(1,2,"12");
        Rezervare rezervare1=new Rezervare(2,4,"11");

        FabricaClient fabricaClient=new FabricaClient();
        IClient client= fabricaClient.getClient("Ion","0908","@yahoo.com");
        client.afiseazDetalii(rezervare);
        client.afiseazDetalii(rezervare1);

    }
}