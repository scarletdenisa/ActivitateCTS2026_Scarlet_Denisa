package main;

import clase.Autobuz;
import clase.Oprire;
import clase.Proxy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz(3,"B101AAA");
        Autobuz autobuz1=new Autobuz(0,"BV11BBB");

        Oprire oprire=new Oprire(autobuz);
        Oprire oprire1=new Oprire(autobuz1);

        Proxy proxy=new Proxy(oprire);
        Proxy proxy1=new Proxy(oprire1);

        proxy.opresteInStatie();
        proxy1.opresteInStatie();
    }
}