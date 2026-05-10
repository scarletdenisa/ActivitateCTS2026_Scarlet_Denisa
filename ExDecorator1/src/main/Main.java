package main;

import clase.Agentie;
import clase.IAgentie;
import decorator.Decorator;
import decorator.DecoratorAnulare;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IAgentie agentie=new Agentie("Christian");
        IAgentie agentiedec=new Agentie("Rowenta");

        Decorator pac2=new DecoratorAnulare(agentiedec);
        agentie.afiseazaPachet();
        agentiedec.afiseazaPachet();
        pac2.anulareRezervare();
}}