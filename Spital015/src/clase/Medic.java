package clase;

public class Medic {
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public void preiaPacienti(){
        System.out.println("Medicul "+this.nume+" a preluat pacientul");
    }
}
