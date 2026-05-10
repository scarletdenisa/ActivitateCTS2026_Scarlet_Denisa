package clase;

public class Optiune implements Structura{
    private int nr;
    private String denumire;

    public Optiune(int nr, String denumire) {
        this.nr = nr;
        this.denumire = denumire;
    }

    @Override
    public void afiseazaStructura(String spatii) {
        System.out.println(spatii+
                "Optiunea "+this.denumire+" cu nr "+this.nr);
    }
}
