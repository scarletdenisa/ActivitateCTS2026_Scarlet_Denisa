package facade;

import clase.Medic;
import clase.Pacient;
import clase.Salon;

public class Facade {
    private Medic medic;
    private Salon salon;

    public Facade(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void interneazaPacient(Pacient pacient){
        if(pacient.getGravitate()>=3){
            if(medic.confirmaInternarea(pacient)){
                int nr=salon.nrPatLiber();
                if(salon.nrPatLiber()!=-1){
                    System.out.println(pacient.toString()+" trebuie internat in patul");
                    salon.ocupaPat(nr);
                    salon.nrPatLiber();
                }else System.out.println("nu sunt paturi libere");
            }else System.out.println("medicul nu a confirmat internarea");
        }else System.out.println("pacientul nu are o stare destul de grava");
    }
}
