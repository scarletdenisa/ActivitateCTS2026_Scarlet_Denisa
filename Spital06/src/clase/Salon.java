package clase;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<Pat> libere;
    private List<Pat> ocupate;

    public Salon() {
        this.libere = new ArrayList<>();
        this.ocupate=new ArrayList<>();

        libere.add(new Pat(1));
        //libere.add(new Pat(2));
        //libere.add(new Pat(3));

        ocupate.add(new Pat(4));
        ocupate.add(new Pat(5));
        ocupate.add(new Pat(6));
    }

    public boolean existaPatLiber(){
        if (libere.size()!=0)
            return true;
        else return false;
    }

    public void ocupaPat(Pacient p){
        if(libere.size()!=0) {
            libere.get(0);
            System.out.println("Patul liber a fost ocupat de catre "+
                    p.getNume()+" cu gravitatea "+p.getGravitate());
            libere.remove(0);

        }
    }


}
