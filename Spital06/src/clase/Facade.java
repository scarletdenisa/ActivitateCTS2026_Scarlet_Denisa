package clase;

public class Facade {
    public void verifica(Pacient p,Medic m,Salon s){
        if (p.getGravitate()>3){
            if(m.verificaMedic(p)){
                if (s.existaPatLiber()){
                    s.ocupaPat(p);
                }else
                    System.out.println("nu mai sunt paturi libere");
            }else System.out.println("Medicul nu a considerat ca e grav");

        }else System.out.println("Pacientul nu are o stare destul de grava");
    }
}
