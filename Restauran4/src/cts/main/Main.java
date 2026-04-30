package cts.main;

import cts.prototype.Rezervare;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Rezervare r1=new Rezervare(1,3,"Denisa",3,"111111");
        Rezervare r2=(Rezervare) r1.copiere();

        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }
}