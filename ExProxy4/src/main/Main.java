package main;

import clase.Hotel;
import clase.Proxy;
import clase.Rezervare;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rezervare r1=new Rezervare(1,12345);
        Rezervare r2=new Rezervare(3,987);

        Hotel hotel=new Hotel(r1);
        Hotel hotel1=new Hotel(r2);

        Proxy proxy1=new Proxy(hotel);
        Proxy proxy2=new Proxy(hotel1);

        proxy1.afiseazaDetalii();
        proxy1.anuleazaRezervare();
        proxy2.afiseazaDetalii();
        proxy2.anuleazaRezervare();
    }
}