package main;

import clase.Departament;
import clase.Sectie;
import clase.Structura;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //spital8
        Structura depSpital=new Departament("Spital");
        Structura depAdministr=new Departament("Administrativ");

        Structura sectieIntensiva=new Sectie("TerapieIntensiva",30);
        Structura sectiePediatrie=new Sectie("Pediatrie",10);

        ((Departament)depSpital).adaugaSTructura(depAdministr);
        ((Departament)depSpital).adaugaSTructura(sectiePediatrie);
        ((Departament)depAdministr).adaugaSTructura(sectieIntensiva);
        depSpital.afiseazaDetaliiStructura("");

        ((Departament)depSpital).stergeStructura(sectiePediatrie);
        System.out.println("---------");
        depSpital.afiseazaDetaliiStructura("");

    }
}