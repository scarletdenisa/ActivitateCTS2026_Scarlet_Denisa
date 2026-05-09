package cts.clase;

public abstract class PersonalMedical implements PersonalSpital{
    protected int varsta;
    protected String spital;
    protected int experienta;
    protected String arie;

    public PersonalMedical(int varsta, String spital, int experienta,String arie) {
        this.varsta = varsta;
        this.spital = spital;
        this.experienta = experienta;
        this.arie=arie;
    }

    @Override
    public abstract void afiseazaDescriere();


}
