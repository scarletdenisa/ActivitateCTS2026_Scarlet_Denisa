package main;

import clase.FabricaPacient;
import clase.IPacient;
import clase.Pacient;
import clase.Spitalizare;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Spitalizare sp1=new Spitalizare(1,1,1);
        Spitalizare sp2=new Spitalizare(2,3,4);

        FabricaPacient fabricaPacient=new FabricaPacient();
        IPacient pac= fabricaPacient.getPacient("Aurel","00844","bucuresti");
        pac.afiseaza(sp1);
        pac.afiseaza(sp2);

    }
}