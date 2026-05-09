package facade;

import clase.Cazare;
import clase.PachetTuristic;
import clase.Zbor;

public class Facade {
    public void trimiteOferta(String hotel,String destinatie, int persoane){
        PachetTuristic pachet=new PachetTuristic();
        pachet.creearePachet();
        Cazare cazare=new Cazare();
        cazare.rezervaHotel(hotel);
        Zbor zbor=new Zbor();
        zbor.gasesteZbor(destinatie,persoane);
    }
}
