package main;

import clase.Medic;
import clase.Pacient;
import clase.Salon;
import facade.Facade;

public class Main {
    public static void main(String[] args) {
        Medic medic=new Medic("dorin");
        Salon salon=new Salon("Terapie intensiva");
        Pacient p1=new Pacient("Andrei",9);
        Pacient p2=new Pacient("Ion",9);
        Pacient p3=new Pacient("Alexia",9);

        Facade facade=new Facade(medic,salon);
        facade.confirmaInternare(p1);
        facade.confirmaInternare(p2);
        facade.confirmaInternare(p3);
    }
}