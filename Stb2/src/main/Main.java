package main;

import prototype.Autobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz(6,"Buc",false);
        Autobuz autobuz1=(Autobuz) autobuz.copiere();
        autobuz1.setRoti(1);
        System.out.println(autobuz.toString());
        System.out.println(autobuz1.toString());
    }
}