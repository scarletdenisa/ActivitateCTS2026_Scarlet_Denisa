package proxy;

import clase.InterfataSpital;
import clase.Pacient;

public class Proxy implements InterfataSpital {
    private InterfataSpital spital;

    public Proxy(InterfataSpital spital) {
        this.spital = spital;
    }

    @Override
    public void interneazaPacient(Pacient pacient) {
        if(pacient.isAreAsigurare()){
            spital.interneazaPacient(pacient);
        }else
            System.out.println("Pacientul nu are asigurare");
    }
}
