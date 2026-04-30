package main;

import inchiriereMasina.Masina;
import inchiriereMasina.MasinaInchiriata;
import pachetTuristic.Adapter;
import pachetTuristic.PachetCazare;
import pachetTuristic.PachetTuristic;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static void veziRezervare(PachetTuristic pachetTuristic){
        System.out.println("pentru clienti:");
        pachetTuristic.afiseazaDescriere();
        System.out.println("pt administrator: ");
        pachetTuristic.rezervaPachet();
    }

    public static void main(String[] args) {

        Masina masina=new Masina("Audi",12.4);
        PachetTuristic cazare=new PachetCazare();
        MasinaInchiriata masinaInchiriata=new MasinaInchiriata(masina);

        veziRezervare(cazare);
        Adapter adapter=new Adapter(masinaInchiriata);
        veziRezervare(adapter);

    }
}