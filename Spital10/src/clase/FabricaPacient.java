package clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaPacient {
    private Map<String, IPacient> pacienti=new HashMap<>();



    public IPacient getPacient(String nume, String tel, String adresa){
        IPacient pacient=pacienti.get(tel);
        if (pacient==null){
            pacient=new Pacient(nume, tel, adresa);
            pacienti.put(tel,pacient);
        }
        return pacient;
    }
}
