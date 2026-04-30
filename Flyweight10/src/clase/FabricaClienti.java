package clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaClienti {
    private Map<String,ClientAbstract> clienti=new HashMap<>();

    public ClientAbstract getClient(String nume, String mail, String telefon){
        ClientAbstract client=clienti.get(telefon);
        if(client==null){
            client=new Client(nume, mail, telefon);
            clienti.put(telefon,client);
        }
        return client;
    }


}
