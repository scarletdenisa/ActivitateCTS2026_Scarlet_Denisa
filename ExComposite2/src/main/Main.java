package main;

import clase.Categorie;
import clase.Optiune;
import clase.Structura;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Structura categorie=new Categorie("Mare");
        Structura munte=new Categorie("Munte");
        Structura romania=new Categorie("romania");
        Structura grecia=new Categorie("grecia");
        Structura all=new Optiune(1,"all inclusive");
        Structura ponton=new Optiune(2,"la ponton");

        ((Categorie)categorie).adauga(romania);
        ((Categorie)categorie).adauga(grecia);
        ((Categorie)romania).adauga(all);
        ((Categorie)romania).adauga(ponton);
        ((Categorie)grecia).adauga(all);
        ((Categorie)grecia).adauga(ponton);
        ((Categorie)munte).adauga(romania);

        categorie.afiseazaStructura("");
        munte.afiseazaStructura("");
        System.out.println(((Categorie)munte).getStructura(0));

    }
}