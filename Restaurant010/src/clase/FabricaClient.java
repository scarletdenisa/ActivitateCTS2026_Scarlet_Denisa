package clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaClient {
    private Map<String,IClient> clienti=new HashMap<>();

    public IClient getClient(String nume, String tel, String adresa){
        IClient client=clienti.get(tel);
        if (client==null){
            client=new Client(nume, tel, adresa);
            clienti.put(tel,client);
        }
        return client;
    }
}
