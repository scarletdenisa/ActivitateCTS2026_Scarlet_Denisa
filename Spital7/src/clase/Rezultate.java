package clase;

public class Rezultate implements Spital{
    private String data;

    public Rezultate(String data) {
        this.data = data;
    }

    @Override
    public void afiseazaRezultate() {
        System.out.println("Rezultatele din data "+
                this.data+" au fost printate");
    }
}
