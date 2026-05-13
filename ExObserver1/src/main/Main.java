package main;

import clase.ISpital;
import clase.Ipacient;
import clase.Pacient;
import clase.Spital;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ipacient pac=new Pacient("Mihai");
        Ipacient pac1=new Pacient("Aurel");
        Ipacient pac2=new Pacient("Ionel");
        ISpital spital=new Spital("Coonstantin");

        spital.abonare(pac1);
        spital.abonare(pac2);
        spital.abonare(pac);

        ((Spital)spital).apareEpidemie();
        ((Spital)spital).apareVirus();
    }
}