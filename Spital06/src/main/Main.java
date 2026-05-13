package main;

import clase.Facade;
import clase.Medic;
import clase.Pacient;
import clase.Salon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pacient p1=new Pacient("Marina",7);
        Pacient p2=new Pacient("Ionut",7);
        Medic medic=new Medic("Abraham");
        Salon salon=new Salon();

        Facade facade=new Facade();
        facade.verifica(p1,medic,salon);
        facade.verifica(p2,medic,salon);
    }
}