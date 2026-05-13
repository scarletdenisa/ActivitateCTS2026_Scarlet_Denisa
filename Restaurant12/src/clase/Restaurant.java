package clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant{
    private String denumire;
    private List<IClient> list;

    public Restaurant(String denumire) {
        this.denumire = denumire;
        this.list=new ArrayList<>();
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for (IClient c:list)
            c.primesteNotificare(mesaj+" de la restaurantul "+this.denumire);
    }

    @Override
    public void aboneaza(IClient c) {
        list.add(c);
    }

    @Override
    public void dezaboneaza(IClient c) {
        list.remove(c);
    }

    public void realizeazaOfrtaPret(){
        trimiteNotificare("A aparut o noua oferta de pret");
    }

    public void introduceMeniu(){
        trimiteNotificare("S-a introdus un nou meniu");
    }
}
