package clase;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements IAgentie{
    private String nume;
    private List<IClient> clienti;

    public Agentie(String nume) {
        this.nume = nume;
        this.clienti=new ArrayList<>();
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for (IClient c:clienti){
            c.primesteMesaj(mesaj+" de la agentia "+this.nume);
        }
    }

    @Override
    public void aboneaza(IClient client) {

        clienti.add(client);
    }

    @Override
    public void dezaboneaza(IClient client) {

        clienti.remove(client);
    }

    public void ofertapret(){
        trimiteMesaj(" oferta noua de pret ");
    }

    public void pachetNou(){
        trimiteMesaj("s a introdus un pachet nou");
    }
}
