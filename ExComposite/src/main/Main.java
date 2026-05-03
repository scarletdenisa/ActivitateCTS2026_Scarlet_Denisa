package main;

import clase.Categorie;
import clase.Structura;
import clase.Subcategorie;

import java.sql.Struct;

public class Main {
    public static void main(String[] args) {
        //ex din curs- agentie
        Structura categorie=new Categorie("PachetTuristic");
        Structura categorie1=new Categorie("PachetCzare");

        Structura subc1=new Subcategorie("Hotel");
        Structura subc2=new Subcategorie("Piscina");

        ((Categorie)categorie).adaugaStructura(categorie1);
        ((Categorie)categorie1).adaugaStructura(subc1);
        ((Categorie)categorie1).adaugaStructura(subc2);
        categorie.afiseazaDescriere("");

        System.out.println("-------");

        ((Categorie)categorie1).stergeStructura(subc1);
        categorie.afiseazaDescriere("");

        System.out.println("-------");
        Structura element=((Categorie) categorie1).getStructura(0);
        element.afiseazaDescriere("");
    }
}