package facade;

import clasa.Masa;

public class FacadeMasa {
    public void afiseazaVerificare(Masa masa){
        if(masa.isEsteLibera()){
            if(masa.isEsteDebarasata()){
                if(masa.isSuntServetele()){
                    System.out.println("Rezervarea se poate face");
                }
                else System.out.println("Pe masa nu sunt servetele");
            }
            else System.out.println("Masa nu este debarasata");
        }
        else System.out.println("Masa nu este libera");
    }
}
