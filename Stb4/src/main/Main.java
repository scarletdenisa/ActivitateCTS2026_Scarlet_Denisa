package main;

import clase.Adapter;
import clase.InterfataAutobuz;
import clase.SoftMetrou;
import clase.SoftTerestru;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SoftMetrou metrou=new SoftMetrou();
        InterfataAutobuz autobuz=new Adapter(metrou);
        metrou.valideazaCartela();
        autobuz.rezervaBilet();

    }
}