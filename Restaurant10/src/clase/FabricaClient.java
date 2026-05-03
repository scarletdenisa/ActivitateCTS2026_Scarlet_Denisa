package clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaClient {

    private Map<String,InterfataClient> clienti=new HashMap<>();

    public InterfataClient getClient(String adresa, String nume, String nrTel){
        InterfataClient client=clienti.get(nrTel);
        if (client==null){
            client=new Client(adresa, nume, nrTel);
            clienti.put(nrTel,client);
        }
        return client;
    }
}
