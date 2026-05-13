package clase;

public class Adaptor extends MedicamentSpital implements IFarmacie{


    public Adaptor(String medicamentSptal, boolean areReteta) {
        super(medicamentSptal, areReteta);
    }

    @Override
    public void cumparaMedicament() {
        this.achizitioneazaMedicament();
    }
}
