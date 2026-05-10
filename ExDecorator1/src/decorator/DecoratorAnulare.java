package decorator;

import clase.IAgentie;

public class DecoratorAnulare extends Decorator{

    public DecoratorAnulare(IAgentie agentie) {
        super(agentie);
    }

    @Override
    public void anulareRezervare() {

        System.out.println("rezervarea a fost anulata");
    }
}
