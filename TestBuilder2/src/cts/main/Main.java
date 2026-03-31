package cts.main;

import cts.builder.Internare;

public class Main {
    public static void main(String[] args) {

        Internare.InternareBuilder builder=new Internare.InternareBuilder();
        Internare internare1=builder.setHalat(true).setNume("Ana").build();
        System.out.println(internare1.toString());
    }
}