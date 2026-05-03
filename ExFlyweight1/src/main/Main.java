package main;

import clase.FabricaPachetTuristic;
import clase.InterfataPachetTuristic;
import clase.OptiuniPersoana;

public class Main {
    public static void main(String[] args) {
        FabricaPachetTuristic fabrica=new FabricaPachetTuristic();

        InterfataPachetTuristic pac1=fabrica.getPachet("Aurelius","124fg5",false,"Romania");
        InterfataPachetTuristic pac2=fabrica.getPachet("NewMontana","98723",true,"Elevtia");

        OptiuniPersoana op1=new OptiuniPersoana(true,5);
        OptiuniPersoana op2=new OptiuniPersoana(true,2);

        pac1.afiseazaPachet(op1);
        pac1.afiseazaPachet(op2);
        pac2.afiseazaPachet(op1);
    }
}