package clase;

public class SoftFactura {
    private String serieFactura;

    public SoftFactura(String serieFactura) {
        this.serieFactura = serieFactura;
    }

    public void printeazafcatura(){
        System.out.println("Factura "+this.serieFactura+
                " a fost printata");
    }
}
