package clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaAutobuzLinie {
    private Map<Integer,IAutobuzLinie> autobuze=new HashMap<>();

    public IAutobuzLinie getAutobuz(int nrLinie, String primaStatie, String ultimaStatie){
        IAutobuzLinie autobuz=autobuze.get(nrLinie);
        if(autobuz==null){
            autobuz=new AutobuzLinie(nrLinie, primaStatie, ultimaStatie);
            autobuze.put(nrLinie,autobuz);
        }
        return autobuz;
    }
}
