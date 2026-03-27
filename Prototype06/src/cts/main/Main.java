package cts.main;


import cts.prototype.Rezervare;

public class Main {
    public static void main(String[] args) {

        Rezervare rezervare1=new Rezervare("RezervareaMea",13,5,"9863576666882897");
        Rezervare rezervare2=(Rezervare) rezervare1.copiere();

        rezervare2.setOra(12);

        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());
    }
}