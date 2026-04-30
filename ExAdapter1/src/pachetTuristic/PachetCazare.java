package pachetTuristic;

public class PachetCazare implements PachetTuristic{
    @Override
    public void afiseazaDescriere() {
        System.out.println("Acest pachet include cazare");
    }

    @Override
    public void rezervaPachet() {

        System.out.println("S-a rezervat un pachet");
    }
}
