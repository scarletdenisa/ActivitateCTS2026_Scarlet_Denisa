package cts.main;

import cts.builder.Rezervare;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Rezervare.RezervareBuilder builder=new Rezervare.RezervareBuilder();
        Rezervare rez1= builder.setAsezareGeam(true).
                setDecorareMasa(true).setGenMuzica("pop").build();
        System.out.println(rez1.toString());;
    }
}