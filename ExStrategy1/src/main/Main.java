package main;

import clase.IPlata;
import clase.PachetTuristic;
import clase.PlataCard;
import clase.PlataCash;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IPlata plataCard=new PlataCard();
        IPlata plataCash=new PlataCash();

        PachetTuristic pachetTuristic=new PachetTuristic(1,"Roma");
        pachetTuristic.plateste();
        pachetTuristic.setPlata(plataCash);
        pachetTuristic.plateste();
    }
}