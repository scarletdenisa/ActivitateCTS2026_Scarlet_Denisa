package clase;

public class Adaptor extends SoftMasina implements PachetTuristic{

    @Override
    public void rezervaPachet() {
        cumparaMasina();
    }
}
