package main;

import clase.Item;
import clase.Sectiune;
import clase.Structura;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Structura starter=new Sectiune("starter");
        Structura bauturi=new Sectiune("Bautura");
        Structura desrt=new Sectiune("Desert");
        Structura suc=new Sectiune("Suc");
        Structura apa=new Sectiune("Apa");
        Structura apaPlata=new Item("Apa plata");
        Structura apaM=new Item("Apa mineral");

        ((Sectiune)starter).adaugaNod(desrt);
        ((Sectiune)bauturi).adaugaNod(suc);
        ((Sectiune)bauturi).adaugaNod(apa);
        ((Sectiune)apa).adaugaNod(apaPlata);
        ((Sectiune)apa).adaugaNod(apaM);

        starter.afiseazaStructura(" ");
        bauturi.afiseazaStructura(" ");

    }
}