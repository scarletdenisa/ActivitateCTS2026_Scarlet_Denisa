package main;

import clase.Calator;
import clase.ModPlata;
import clase.PlataCard;
import clase.PlataSms;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calator calator=new Calator("Andrei");
        ModPlata card=new PlataCard();
        ModPlata sms=new PlataSms();

        calator.plateste(160);
        calator.setPlata(card);
        calator.plateste(10);
        calator.setPlata(sms);
        calator.plateste(2);
    }
}