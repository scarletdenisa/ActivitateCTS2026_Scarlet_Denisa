package cts.exercitiu1.main;

import cts.exercitiu1.v1.PachetTransport;
import cts.exercitiu1.v1.PachetTransportBuilder;
import cts.exercitiu1.v3.PachetCazare;

public class Main {
    public static void main(String[] args) {

        //v1
        PachetTransport pachetTransport=new PachetTransportBuilder().setHasWiFi(true).setHasAC(true).build();
        System.out.println(pachetTransport.toString());

        //v3
        PachetCazare pachetCazare=PachetCazare.builder().setHasTV(true).build();
        System.out.println(pachetCazare.toString());

        //v2
        cts.exercitiu1.v2.PachetTransport pachetTransport1=new cts.exercitiu1.v2.PachetTransportBuilder().setFumator(true).build();
        System.out.println(pachetTransport1.toString());


    }
}