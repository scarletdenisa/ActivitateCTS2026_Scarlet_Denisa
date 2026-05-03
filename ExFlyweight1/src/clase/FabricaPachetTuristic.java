package clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaPachetTuristic {
    private Map<String,InterfataPachetTuristic> pachete=new HashMap<>();

    public InterfataPachetTuristic getPachet(String hotel, String cod, boolean micDejun, String destinatie){
        InterfataPachetTuristic pachet=pachete.get(cod);
        if(pachet==null){
            pachet=new PachetTurstic(hotel, cod, micDejun, destinatie);
            pachete.put(cod,pachet);
        }
        return pachet;
    }
}
