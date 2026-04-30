package cts.main;

import cts.prototype.Restaurant;

public class Main {
    public static void main(String[] args) {

        Restaurant restaurant=new Restaurant("Restaurant",12,"0989898989");
        Restaurant restaurant1=(Restaurant) restaurant.copiere();
        System.out.println(restaurant1.toString());
        System.out.println(restaurant.toString());
    }
}