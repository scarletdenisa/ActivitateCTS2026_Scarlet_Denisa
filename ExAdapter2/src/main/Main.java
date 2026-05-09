package main;

import clase.Adaptor;
import clase.PachetTuristic;
import clase.SoftAgentie;
import clase.SoftMasina;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//        PachetTuristic agentie=new SoftAgentie("Camaran",2010);
//        SoftMasina masina=new SoftMasina();
//
//        agentie.rezervaPachet();
//        masina.cumparaMasina();
//
//        Adaptor adaptor=new Adaptor();
//        adaptor.rezervaPachet();

        PachetTuristic pachet=new Adaptor();
        pachet.rezervaPachet();
    }
}