package clase;

public class Adapter  implements InterfataAutobuz{

    private SoftMetrou soft;

    public Adapter(SoftMetrou soft) {
        this.soft = soft;
    }

    @Override
    public void rezervaBilet() {
        soft.valideazaCartela();
    }
}
