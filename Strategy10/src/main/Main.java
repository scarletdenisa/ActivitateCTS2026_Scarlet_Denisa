package main;

import clase.Client;
import clase.ModalitateaDePlata;
import clase.PlataCard;
import clase.PlataCash;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Client c1=new Client("Denisa");
        Client c2=new Client("Matei");

       ModalitateaDePlata modalitateaDePlata=new PlataCard(200);


        c1.platesteSuma(150);
        c1.setModalitateaDePlata(modalitateaDePlata);
        c1.platesteSuma(1500);
    }
}