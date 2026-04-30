package cts.clase;

public abstract class PersonalSpital {
    protected int varsta;
    protected String nume;
    protected int experienta;

    public PersonalSpital(int varsta, String nume, int experienta) {
        this.varsta = varsta;
        this.nume = nume;
        this.experienta = experienta;
    }

    public abstract void afiseazaDescriere();
}
