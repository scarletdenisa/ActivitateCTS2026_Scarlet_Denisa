package main;

import clase.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Verificare ue=new Ue();
        Verificare non=new NonUe();
        Verificare america=new American();

        Cetatean cetatean=new Cetatean("matei");

        cetatean.verifica();
        cetatean.setVerificare(non);
        cetatean.verifica();
        cetatean.setVerificare(america);
        cetatean.verifica();
    }
}