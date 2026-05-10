package clase;

public class Hotel implements IHotel{
    private String nume;

    public Hotel(String nume) {
        this.nume = nume;
    }

    @Override
    public void priteazaFactura() {
        System.out.println("Factura hotelului "+this.nume+
                " a fost printata");
    }
}
