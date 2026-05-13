package clase;

import java.util.HashMap;
import java.util.Map;

public class PachetFabrica{
    private Map<Integer,IPachet> pachete=new HashMap<>();

    public IPachet getPachet(String hotel, String destinatie, boolean micDejun,int cod){
        IPachet pachet=pachete.get(cod);
        if(pachet==null){
            pachet=new Pachet(hotel, destinatie, micDejun,cod);
            pachete.put(cod,pachet);
        }
        return pachet;
    }


}
