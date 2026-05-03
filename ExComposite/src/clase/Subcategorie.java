package clase;

public class Subcategorie implements Structura {
    private String denumire;

    public Subcategorie(String denumire) {
        this.denumire = denumire;
    }


    @Override
    public void afiseazaDescriere(String spatii) {
        System.out.println(spatii+" subcategoria: "+
                this.denumire);
    }
}
