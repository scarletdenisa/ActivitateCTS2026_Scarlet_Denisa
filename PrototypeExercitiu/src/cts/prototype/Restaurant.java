package cts.prototype;

public class Restaurant implements IRestaurant{
    private String nume;
    private int nrPersoane;
    private String numarTelefon;

    public Restaurant(){

    }

    public Restaurant(String nume, int nrPersoane, String numarTelefon) {
        this.nume = nume;
        this.nrPersoane = nrPersoane;
        this.numarTelefon = numarTelefon;
    }

    @Override
    public IRestaurant copiere() {
        Restaurant restaurant=new Restaurant();
        restaurant.nume=this.nume;
        restaurant.nrPersoane=this.nrPersoane;
        restaurant.numarTelefon=this.numarTelefon;
        return restaurant;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Restaurant{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
