package main;

import clase.FabricaAutobuzLinie;
import clase.IAutobuzLinie;
import clase.State;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        State optiune=new State("a9",2004,20);
        State optiune1=new State("i9",1900,30);

        FabricaAutobuzLinie fabricaAutobuzLinie=new FabricaAutobuzLinie();
        IAutobuzLinie autobuzLinie= fabricaAutobuzLinie.getAutobuz(1,"Racovita","Leonida");

        autobuzLinie.afiseazaDetaliiAutobuz(optiune);
        autobuzLinie.afiseazaDetaliiAutobuz(optiune1);
    }
}