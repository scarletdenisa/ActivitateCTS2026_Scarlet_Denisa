package clase;

public class Medic {
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public void preiapacient(Pacient p){
        System.out.println("Medicul "+this.nume+" a preluat pacientul "+
                p.toString());
    }
}
