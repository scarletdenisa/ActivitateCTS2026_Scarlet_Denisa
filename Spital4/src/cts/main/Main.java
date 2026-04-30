package cts.main;

import cts.prototype.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta r1=new Reteta(1,"12/02/2026",5,false);
        Reteta r2=(Reteta) r1.copiere();

        r2.setCod(2);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }
}