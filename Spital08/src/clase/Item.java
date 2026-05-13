package clase;

public class Item implements Structura{
    private String nume;

    public Item(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaStructura(String spatii) {
        System.out.println(spatii+"Itemul este "+this.nume);
    }
}
