package main;

import aplicatieFarmacie.Adapter;
import aplicatieFarmacie.MedicamentFarmacie;
import aplicatieSpital.MedicamentSpital;

public class Main {

    public static void realizeazaAchizitie(MedicamentFarmacie medicamentFarmacie){
        medicamentFarmacie.cumparaMedicament();
    }

    public static void main(String[] args) {

        MedicamentSpital nurofen=new MedicamentSpital();
        MedicamentFarmacie paracetamol=new MedicamentFarmacie();

        realizeazaAchizitie(paracetamol);
        Adapter adapter=new Adapter(nurofen);
        realizeazaAchizitie(adapter);

    }
}
