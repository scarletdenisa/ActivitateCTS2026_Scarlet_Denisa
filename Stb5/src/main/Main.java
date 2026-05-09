package main;

import facade.Facade;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Facade facade=new Facade();
        facade.deschideFortat();
        facade.deschideLiber();
    }
}