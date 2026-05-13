package main;

import clase.IPachet;
import clase.Optional;
import clase.Pachet;
import clase.PachetFabrica;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Optional optional=new Optional(true,2);
        PachetFabrica fabrica=new PachetFabrica();
        IPachet pachet1= fabrica.getPachet("Montana","Bari",true,12);

        pachet1.descrierePachet(optional);

    }
}