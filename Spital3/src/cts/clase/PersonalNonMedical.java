package cts.clase;

public abstract class PersonalNonMedical implements PersonalSpital{
    protected int varsta;
    protected String spital;
    protected int experienta;

    public PersonalNonMedical(int varsta, String spital, int experienta) {
        this.varsta = varsta;
        this.spital = spital;
        this.experienta = experienta;
    }

    @Override
    public abstract void afiseazaDescriere();
}
