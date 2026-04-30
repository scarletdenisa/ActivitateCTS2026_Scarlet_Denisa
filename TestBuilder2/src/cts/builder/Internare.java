package cts.builder;

public class Internare {
    private boolean patRabatat;
    private boolean micDejun;
    private boolean papuci;
    private boolean halat;
    private String nume;


    private Internare(InternareBuilder builder) {
        this.patRabatat = builder.patRabatat;
        this.micDejun = builder.micDejun;
        this.papuci = builder.papuci;
        this.halat = builder.halat;
        this.nume=builder.nume;
    }

    public boolean isPatRabatat() {
        return patRabatat;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internare{");
        sb.append("patRabatat=").append(patRabatat);
        sb.append(", micDejun=").append(micDejun);
        sb.append(", papuci=").append(papuci);
        sb.append(", halat=").append(halat);
        sb.append(", nume=").append(nume);
        sb.append('}');
        return sb.toString();
    }

    public static InternareBuilder builder(){
        return new InternareBuilder();
    }

    public static class InternareBuilder implements Builder{

        private boolean patRabatat;
        private boolean micDejun;
        private boolean papuci;
        private boolean halat;
        private String nume;

        public InternareBuilder setNume(String nume) {
            this.nume = nume;
            return this;
        }

        public InternareBuilder setHalat(boolean halat) {
            this.halat = halat;
            return this;
        }

        public InternareBuilder setPapuci(boolean papuci) {
            this.papuci = papuci;
            return this;
        }

        public InternareBuilder setMicDejun(boolean micDejun) {
            this.micDejun = micDejun;
            return this;
        }

        public InternareBuilder setPatRabatat(boolean patRabatat) {
            this.patRabatat = patRabatat;
            return this;
        }

        @Override
        public Internare build() {
            return new Internare(this);
        }
    }
}
