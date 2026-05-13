package clase;

public class Masa {
    private int id;

    public Masa(int id) {
        this.id = id;
    }

    public void primesteOcupari(){
        System.out.println("Masa "+this.id+" a fost ocupata/rezervata");
    }
}
