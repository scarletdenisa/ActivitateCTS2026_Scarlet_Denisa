package main;

import clase.Agentie;
import clase.Client;
import clase.IAgentie;
import clase.IClient;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IAgentie agentie=new Agentie("Loll");

        IClient c1=new Client("Iona");
        IClient c2=new Client("Maria");

        agentie.aboneaza(c1);
        agentie.aboneaza(c2);

        ((Agentie)agentie).ofertapret();

        agentie.dezaboneaza(c1);
        ((Agentie)agentie).pachetNou();
    }
}