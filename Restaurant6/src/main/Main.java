package main;


import clasa.Masa;
import facade.FacadeMasa;

public class Main {
    public static void main(String[] args) {
        Masa m1=new Masa(true,true,true);
        Masa m2=new Masa(false,false,false);
        Masa m3=new Masa(true,true,false);

        FacadeMasa facade=new FacadeMasa();
        facade.afiseazaVerificare(m1);
        facade.afiseazaVerificare(m2);
        facade.afiseazaVerificare(m3);
    }
}