package cts.builder;

public class Internare {
    protected boolean patRabatabil;
    protected boolean micDejun;
    protected boolean papuci;
    protected boolean halat;
    protected String nume;

    public Internare(boolean patRabatabil, boolean micDejun, boolean papuci, boolean halat, String nume) {
        this.patRabatabil = patRabatabil;
        this.micDejun = micDejun;
        this.papuci = papuci;
        this.halat = halat;
        this.nume = nume;
    }

    public boolean isPatRabatabil() {
        return patRabatabil;
    }

    public boolean isMicDejun() {
        return micDejun;
    }

    public boolean isPapuci() {
        return papuci;
    }

    public boolean isHalat() {
        return halat;
    }

    public String getNume() {
        return nume;
    }

    public void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    public void setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
    }

    public void setPapuci(boolean papuci) {
        this.papuci = papuci;
    }

    public void setHalat(boolean halat) {
        this.halat = halat;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internare{");
        sb.append("patRabatabil=").append(patRabatabil);
        sb.append(", micDejun=").append(micDejun);
        sb.append(", papuci=").append(papuci);
        sb.append(", halat=").append(halat);
        sb.append(", nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
