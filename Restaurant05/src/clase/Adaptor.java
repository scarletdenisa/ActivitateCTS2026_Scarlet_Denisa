package clase;

public class Adaptor extends SoftFactura implements Bar{


    public Adaptor(String serieFactura) {
        super(serieFactura);

    }

    @Override
    public void afiseazaDetalii() {
        super.printeazafcatura();
    }
}
