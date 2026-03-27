package cts.main;

import cts.clasa.Hotel;
import cts.clasa.Lidl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Lidl lidl1=Lidl.getInstance(3,"Brasov",true);
        lidl1.descrie();
        Lidl lidl2=Lidl.getInstance(2,"Buc",false);
        lidl2.descrie();

        Hotel h1=Hotel.getInstance("Cosmopolis",10,9);
        h1.afiseazaDescriere();
        Hotel h2=Hotel.getInstance("Aurelius",20,20);
        h2.afiseazaDescriere();
        h2.rezervaCamera();
        h1.rezervaCamera();
    }

}