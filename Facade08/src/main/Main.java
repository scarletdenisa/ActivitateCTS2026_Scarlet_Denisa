package main;

import clase.Medic;
import clase.Pacient;
import clase.Salon;
import facade.Facade;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Pacient p1=new Pacient("Alex",4);
        Pacient p2=new Pacient("Laura",1);
        Pacient p3=new Pacient("Den",10);
        Medic medic=new Medic("Medic");
        Salon salon=Salon.getInstance();

        Facade facade=new Facade(medic,salon);
        facade.interneazaPacient(p1);
        facade.interneazaPacient(p2);
        facade.interneazaPacient(p3);
    }
}