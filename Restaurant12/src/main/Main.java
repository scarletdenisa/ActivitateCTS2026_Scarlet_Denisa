package main;

import clase.ClientFidel;
import clase.IClient;
import clase.IRestaurant;
import clase.Restaurant;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IClient client=new ClientFidel("Ion");
        IClient client1=new ClientFidel("Maria");
        IClient client2=new ClientFidel("Grigore");

        IRestaurant restaurant=new Restaurant("La Cocosatu");

        restaurant.aboneaza(client1);
        restaurant.aboneaza(client2);
        restaurant.aboneaza(client);
        ((Restaurant)restaurant).introduceMeniu();
        restaurant.dezaboneaza(client1);
        restaurant.dezaboneaza(client);
        ((Restaurant)restaurant).realizeazaOfrtaPret();
    }
}