package main;

import clase.Hotel;
import clase.IHotel;
import decorator.Decorator;
import decorator.DecoratorMesajDiscount;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IHotel hotel=new Hotel("Aurelius");
        IHotel hoteldec=new Hotel("Continental");

        Decorator dec=new DecoratorMesajDiscount(hoteldec);
        hotel.priteazaFactura();
        //hoteldec.priteazaFactura();
        dec.adaugaDiscount(20);
    }
}