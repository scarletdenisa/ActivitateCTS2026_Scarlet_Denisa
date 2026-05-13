package main;

import clase.Adaptor;
import clase.IFarmacie;
import clase.MedicamentFarmacie;
import clase.MedicamentSpital;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void realizeazaAchizitie(IFarmacie medicamentFarmacie){
        medicamentFarmacie.cumparaMedicament();
    }

    public static void main(String[] args) {
        MedicamentSpital spital=new MedicamentSpital("nurofen",true);
        MedicamentFarmacie farmacie=new MedicamentFarmacie();

        spital.achizitioneazaMedicament();
        farmacie.cumparaMedicament();

        Adaptor adaptor=new Adaptor("Paracetamol",true);
        adaptor.cumparaMedicament();

        System.out.println("------");
        realizeazaAchizitie(farmacie);
        Adaptor adaptor1=new Adaptor("spital",true);
        realizeazaAchizitie(adaptor1);
    }
}