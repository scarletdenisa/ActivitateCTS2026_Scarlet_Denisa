package decorator;

import clase.IHotel;

public abstract class Decorator implements IHotel {
    private IHotel hotel;

    public Decorator(IHotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public void priteazaFactura() {
        hotel.priteazaFactura();
    }

    public abstract void adaugaDiscount(int discount);
}
