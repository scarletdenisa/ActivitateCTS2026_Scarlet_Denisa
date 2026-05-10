package decorator;

import clase.IHotel;

public class DecoratorMesajDiscount extends Decorator{
    public DecoratorMesajDiscount(IHotel hotel) {
        super(hotel);
    }

    @Override
    public void adaugaDiscount(int discount) {
        super.priteazaFactura();
        System.out.println("La multi ani! Ati primit un discount de "+
                discount+"%");

    }
}
