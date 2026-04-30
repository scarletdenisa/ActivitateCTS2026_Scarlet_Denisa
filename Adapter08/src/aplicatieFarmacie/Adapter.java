package aplicatieFarmacie;

import aplicatieSpital.MedicamentSpital;

public class Adapter extends MedicamentFarmacie{
    private MedicamentSpital medicamentSpital;

    public Adapter(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament(){
        medicamentSpital.achizitioneazaMedicament();
    }
}
