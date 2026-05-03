package facade;

import clase.Medic;
import clase.Pacient;
import clase.Pat;
import clase.Salon;

public class Facade {
    private Medic m;
    private Salon s;

    public Facade(Medic medic, Salon salon) {
        this.m = medic;
        this.s = salon;
    }

    public void confirmaInternare(Pacient p){
        if(p.getGravitate()>=4){
            if(m.confirmaMedic(p)){
                if(s.existaPaturiDisponibile()) {
                    Pat pat=s.ocupaPat();
                    System.out.println("Pacientul " + p.getNume() +
                            " a fost internat in patul "+pat.getNrPat());
                }
                else
                    System.out.println("Nu exista paturi disponibile");
            }else System.out.println("Medicul "+m.getNume()+" nu considera grav");
        }else System.out.println("Gravitatea pacientului "+p.getGravitate()+"" +
                " nu este destul de mare");
    }
}
