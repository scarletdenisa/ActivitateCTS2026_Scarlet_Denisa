package main;

import clase.INotaPlata;
import clase.NotaPlata;
import decorator.Decorator1Mai;
import decorator.DecoratorAnulNou;
import decorator.DecoratorNotaPlata;

public class Main {
    public static void main(String[] args) {

        INotaPlata nota1=new NotaPlata(156.99,"11.09.2026");
        nota1.printeaza();

        DecoratorNotaPlata decorator=new Decorator1Mai(nota1);
        decorator.printeazaFelicitare();
        decorator.printeaza();

        DecoratorNotaPlata dec=new DecoratorAnulNou(nota1);
        dec.printeazaFelicitare();
    }

}