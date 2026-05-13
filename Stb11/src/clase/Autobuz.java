package clase;

import java.util.ArrayList;
import java.util.List;

public class Autobuz implements AplicatieAutobuz{
    private String nrImatriculare;
    private List<ICalator> calatori;

    public Autobuz(String nrImatriculare) {
        this.nrImatriculare = nrImatriculare;
        this.calatori=new ArrayList<>();
    }

    @Override
    public void notificaCalatori(String mesaj) {
        for (ICalator C:calatori)
            C.primesteNotificare(mesaj+" de la autobuzul "+ this.nrImatriculare);
    }

    @Override
    public void aboneaza(ICalator c) {

        calatori.add(c);
    }

    @Override
    public void dezaboneaza(ICalator c) {

        calatori.remove(c);
    }

    public void pleacaautobuz(){
        notificaCalatori("Autobuzul "+this.nrImatriculare+" a plecat din capat");
    }
}
