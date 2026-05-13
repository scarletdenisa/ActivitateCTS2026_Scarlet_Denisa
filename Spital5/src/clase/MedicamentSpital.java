package clase;

public class MedicamentSpital {
    private String medicamentSptal;
    private boolean areReteta;

    public MedicamentSpital(String medicamentSptal, boolean areReteta) {
        this.medicamentSptal = medicamentSptal;
        this.areReteta = areReteta;
    }

    public void achizitioneazaMedicament(){
        System.out.println(prezintaReteta()?
                "S a achizitionat medicamentul "+this.medicamentSptal+" din spital":
                "Nu are reteta");
    }

    private boolean prezintaReteta(){
        if (areReteta==true)
            return true;
        else
            return false;
    }
}
