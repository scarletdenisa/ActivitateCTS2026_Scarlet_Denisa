package proxy;

import clase.InterfataAgentie;
import clase.Pensionar;

public class ProxyPensionari implements InterfataAgentie {

    private InterfataAgentie agentie;

    public ProxyPensionari(InterfataAgentie agentie) {
        this.agentie = agentie;
    }

    @Override
    public void rezervaPachet(Pensionar pensionar) {
        if(pensionar.getVarsta()>65)
            agentie.rezervaPachet(pensionar);
        else
            System.out.println("Pensionarul nu are penste 65 ani");
    }
}
