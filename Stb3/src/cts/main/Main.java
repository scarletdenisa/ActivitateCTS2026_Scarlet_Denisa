package cts.main;

import cts.builder.AutobuzLinie;

public class Main {
    public static void main(String[] args) {
        AutobuzLinie.AutobuzLinieBuilder builder=new AutobuzLinie.AutobuzLinieBuilder();
        AutobuzLinie autobuzLinie=builder.setOpriri(true).setSofer("Alex").setTextAfisat("urmatoarea statie...").build();
        System.out.println(autobuzLinie.toString());
    }
}