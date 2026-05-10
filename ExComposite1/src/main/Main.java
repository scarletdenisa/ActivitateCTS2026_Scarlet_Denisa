package main;

import clase.Departament;
import clase.Sectie;
import clase.Structura;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Structura depSpital=new Departament("Spital");
        Structura depAdministrator=new Departament("Administrativ");
        Structura sectiePediatrie=new Sectie(2,12);
        Structura depMorga=new Departament("Morga");
        Structura depCentral=new Departament("Central");
        Structura sectieOftalmologie=new Sectie(4,3);

        ((Departament)depSpital).adauga(sectieOftalmologie);
        ((Departament)depSpital).adauga(depMorga);
        ((Departament)depAdministrator).adauga(depCentral);
        ((Departament)depAdministrator).adauga(depSpital);
        ((Departament)depAdministrator).adauga(sectiePediatrie);

        depSpital.afiseazaStructura("");
        depAdministrator.afiseazaStructura("");
    }
}