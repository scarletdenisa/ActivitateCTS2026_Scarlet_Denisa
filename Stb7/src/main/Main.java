package main;

import clase.Bilet;
import clase.IBilet;
import decorator.Decorator;
import decorator.DecoratorMesaj;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IBilet bilet1=new Bilet(1);
        IBilet biletdec=new Bilet(2);

        Decorator dec=new DecoratorMesaj(biletdec);

        bilet1.printeazaBilet();
        dec.adaugaMesaj();
    }
}