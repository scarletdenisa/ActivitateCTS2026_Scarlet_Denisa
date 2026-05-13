package main;

import clase.Facade;
import clase.Masa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Masa m1=new Masa(1,0,3,19);
        Masa m2=new Masa(2,1,1,1);
        Masa m3=new Masa(3,0,1,3);
        Masa m4=new Masa(4,2,4,11);
        //Masa m5=new Masa(5,)

        Facade facade=new Facade();
        facade.verificaMasa(m1);
        facade.verificaMasa(m2);
        facade.verificaMasa(m3);
        facade.verificaMasa(m4);
        //facade.verificaMasa();
    }
}