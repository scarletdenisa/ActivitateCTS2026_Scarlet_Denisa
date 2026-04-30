package cts.main;

import cts.Hotel;

public class Main {
    public static void main(String[] args) {

        Hotel hotel1=Hotel.getInstance("Clermont",3,7);
        Hotel hotel2=Hotel.getInstance("Aplinevilla",0,100);
        //hotel1.afiseazaDescriere();
        //hotel2.afiseazaDescriere();
        hotel1.afiseazaDescriere();
        hotel1.rezervaCamera();
        hotel1.rezervaCamera();
        hotel1.afiseazaDescriere();
        //hotel2.rezervaCamera();
        //hotel2.afiseazaDescriere();
    }
}