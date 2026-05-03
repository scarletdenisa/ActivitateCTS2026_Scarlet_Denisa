package main;


import lucruBar.Adapter;
import lucruBar.SoftBar;
import lucruBucatarie.SoftPrintare;

public class Main {
    public static void finalizeazaIntegrare(SoftBar softBar){
        softBar.integrareSoftBar();
    }

    public static void main(String[] args) {

        SoftBar bar=new SoftBar();
        SoftPrintare bucatarie=new SoftPrintare();

        finalizeazaIntegrare(bar);
        Adapter adapter=new Adapter(bucatarie);
        finalizeazaIntegrare(adapter);


    }
}