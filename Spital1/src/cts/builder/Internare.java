package cts.builder;

public class Internare {
    private final boolean patRabatabil;
    private final boolean micDejun;
    private final boolean papuci;
    private final boolean halat;
    private final String nume;

    private Internare(InternareBuilder builder) {
        this.patRabatabil = builder.patRabatabil;
        this.micDejun = builder.micDejun;
        this.papuci = builder.papuci;
        this.halat = builder.halat;
        this.nume = builder.nume;
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

    public static InternareBuilder builder(String nume){
        return new InternareBuilder(nume);
    }

    public static class InternareBuilder implements Builder{

        private boolean patRabatabil=false;
        private boolean micDejun=false;
        private boolean papuci=false;
        private boolean halat=false;
        private String nume;

        public InternareBuilder(String nume) {
            this.nume = nume;
        }

        public InternareBuilder setPatRabatabil(boolean patRabatabil) {
            this.patRabatabil = patRabatabil;
            return this;
        }

        public InternareBuilder setMicDejun(boolean micDejun) {
            this.micDejun = micDejun;
            return this;
        }

        public InternareBuilder setPapuci(boolean papuci) {
            this.papuci = papuci;
            return this;
        }

        public InternareBuilder setHalat(boolean halat) {
            this.halat = halat;
            return this;
        }

        public InternareBuilder setNume(String nume) {
            this.nume = nume;
            return this;
        }

        @Override
        public Internare build() {
            return new Internare(this);
        }
    }
}
