package clase;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private String denumire;
    private List<Pat> paturiLibere;
    private List<Pat> paturiOcupate;

    public Salon(String denumire) {
        this.denumire = denumire;
        this.paturiLibere=new ArrayList<>();
        this.paturiOcupate=new ArrayList<>();

        paturiLibere.add(pat1);
        paturiLibere.add(pat2);
        paturiOcupate.add(pat3);
        paturiOcupate.add(pat4);
        paturiOcupate.add(pat5);
    }

    Pat pat1=new Pat(1);
    Pat pat2=new Pat(2);
    Pat pat3=new Pat(3);
    Pat pat4=new Pat(4);
    Pat pat5=new Pat(5);


    public boolean existaPaturiDisponibile(){
        if(paturiLibere.size()>=1)
            return true;
        else
            return false;
    }

    public  Pat ocupaPat(){
        if(paturiLibere.size()>=1){
            Pat pat=paturiLibere.remove(0);
            paturiOcupate.add(pat);
            return pat;
        }
        return null;
    }

}
