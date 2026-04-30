package cts.main;

import cts.builder.PachetCalatorie;


public class Main {
    public static void main(String[] args) {

        PachetCalatorie pachet=PachetCalatorie.builder().
                setAreAC(true).setAreTV(true).build();
        System.out.println(pachet.toString());
    }
}