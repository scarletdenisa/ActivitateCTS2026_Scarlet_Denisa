package main;

import clase.Decorator;
import clase.DecoratorLaMultiAni;
import clase.INotaDePlata;
import clase.NotaDePlata;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        INotaDePlata nota=new NotaDePlata("12.09.2026",1);
        nota.printeazaNota();
        Decorator decorator=new DecoratorLaMultiAni(nota);
        decorator.printeazaNota();
    }
}