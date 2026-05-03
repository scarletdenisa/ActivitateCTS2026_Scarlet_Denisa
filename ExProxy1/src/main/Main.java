package main;

import clase.Agentie;
import clase.InterfataAgentie;
import clase.Pensionar;
import proxy.ProxyPensionari;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        InterfataAgentie agentie=new Agentie("Christian Tour");
        Pensionar p1=new Pensionar("Ionel",45);
        Pensionar p2=new Pensionar("Alexandra",68);

        ProxyPensionari proxyPensionari=new ProxyPensionari(agentie);
        proxyPensionari.rezervaPachet(p1);
        proxyPensionari.rezervaPachet(p2);
    }
}