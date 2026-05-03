package clase;

public class Medic {
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public boolean confirmaMedic(Pacient p){
        if(p.getGravitate()>=7){
            return true;
        }
        else return false;
    }
}
