package main;

import clase.Adaptor;
import clase.Bar;
import clase.SoftBar;
import clase.SoftFactura;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void afiseazaBar(Bar bar){
        bar.afiseazaDetalii();
    }

    public static void main(String[] args) {
        Bar cocktail=new SoftBar(2011);
        SoftFactura factura=new SoftFactura("SV");

        afiseazaBar(cocktail);
        factura.printeazafcatura();

        Adaptor adaptor=new Adaptor("ZV");
        afiseazaBar(adaptor);
    }
}