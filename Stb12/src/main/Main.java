package main;

import clase.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calator c=new Calator("Alex",11);

        Modul autobuz=new Autobuz();
        Modul metrou=new Metrou();
        Modul tramvai=new Tramvai();
        Modul troleibuz=new Troleibuz();

        troleibuz.setModulUrmator(autobuz);
        autobuz.setModulUrmator(tramvai);
        tramvai.setModulUrmator(metrou);

        troleibuz.recomandaTransport(c);
    }
}