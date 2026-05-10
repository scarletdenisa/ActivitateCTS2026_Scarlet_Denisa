package decorator;

import clase.IAgentie;

public abstract class Decorator implements IAgentie {
    private IAgentie agentie;

    public Decorator(IAgentie agentie) {
        this.agentie = agentie;
    }

    @Override
    public void afiseazaPachet() {
        agentie.afiseazaPachet();
    }

    public abstract void anulareRezervare();
}
