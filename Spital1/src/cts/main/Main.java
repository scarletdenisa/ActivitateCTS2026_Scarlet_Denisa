package cts.main;

import cts.builder.Internare;

public class Main {
    public static void main(String[] args) {
        Internare.InternareBuilder builder=new Internare.InternareBuilder();
        Internare i1=builder.setPapuci(true).setHalat(true).setNume("Denisa").build();
        System.out.println(i1.toString());
    }
}