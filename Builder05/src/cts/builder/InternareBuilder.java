package cts.builder;

public class InternareBuilder implements InternareBuilderAbstract{
    private Internare internare;

    public InternareBuilder(String nume){
        this.internare=new Internare(false,false,false,false,nume);
    }

    public InternareBuilder setPatRabatabil(boolean arepatRabatabil) {
        internare.patRabatabil = arepatRabatabil;
        return this;
    }

    public InternareBuilder setMicDejun(boolean aremicDejun) {
        internare.micDejun = aremicDejun;
        return this;
    }

    public InternareBuilder setPapuci(boolean arepapuci) {
        internare.papuci = arepapuci;
        return this;
    }

    public InternareBuilder setHalat(boolean arehalat) {
        internare.halat = arehalat;
        return this;
    }

    public InternareBuilder setNume(String nume) {
        internare.nume = nume;
        return this;
    }

    @Override
    public Internare build() {
        return internare;
    }
}
