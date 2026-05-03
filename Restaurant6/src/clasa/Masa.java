package clasa;

public class Masa {
    private boolean esteLibera;
    private boolean esteDebarasata;
    private boolean suntServetele;

    public Masa(boolean esteLibera, boolean suntServetele, boolean esteDebarasata) {
        this.esteLibera = esteLibera;
        this.suntServetele = suntServetele;
        this.esteDebarasata = esteDebarasata;
    }

    public boolean isEsteLibera() {
        return esteLibera;
    }

    public boolean isSuntServetele() {
        return suntServetele;
    }

    public boolean isEsteDebarasata() {
        return esteDebarasata;
    }
}
