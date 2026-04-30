package clase;

public class Medic {
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public boolean confirmaInternarea(Pacient pacient){
        if(pacient.getGravitate()>=6)
            return true;
        else
            return false;
    }
}
