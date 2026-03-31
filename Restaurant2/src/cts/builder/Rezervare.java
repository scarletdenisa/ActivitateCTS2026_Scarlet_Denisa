package cts.builder;

public class Rezervare {
    private boolean asezareGeam;
    private boolean scauneErgonomice;
    private boolean decorareMasa;
    private boolean muzicaAmbientala;
    private String genMuzica;

    private Rezervare(RezervareBuilder builder) {
        this.asezareGeam = builder.asezareGeam;
        this.scauneErgonomice = builder.scauneErgonomice;
        this.decorareMasa = builder.decorareMasa;
        this.muzicaAmbientala = builder.muzicaAmbientala;
        this.genMuzica = builder.genMuzica;
    }

    public String getGenMuzica() {
        return genMuzica;
    }

    public boolean isAsezareGeam() {
        return asezareGeam;
    }

    public boolean isScauneErgonomice() {
        return scauneErgonomice;
    }

    public boolean isDecorareMasa() {
        return decorareMasa;
    }

    public boolean isMuzicaAmbientala() {
        return muzicaAmbientala;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("asezareGeam=").append(asezareGeam);
        sb.append(", scauneErgonomice=").append(scauneErgonomice);
        sb.append(", decorareMasa=").append(decorareMasa);
        sb.append(", muzicaAmbientala=").append(muzicaAmbientala);
        sb.append(", genMuzica=").append(genMuzica);
        sb.append('}');
        return sb.toString();
    }
    public static RezervareBuilder builder(){
        return new RezervareBuilder();
    }
    public static class RezervareBuilder implements Builder{

        private boolean asezareGeam;
        private boolean scauneErgonomice;
        private boolean decorareMasa;
        private boolean muzicaAmbientala;
        private String genMuzica;

        public RezervareBuilder setAsezareGeam(boolean asezareGeam) {
            this.asezareGeam = asezareGeam;
            return this;
        }

        public RezervareBuilder setScauneErgonomice(boolean scauneErgonomice) {
            this.scauneErgonomice = scauneErgonomice;
            return this;
        }

        public RezervareBuilder setDecorareMasa(boolean decorareMasa) {
            this.decorareMasa = decorareMasa;
            return this;
        }

        public RezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
            this.muzicaAmbientala = muzicaAmbientala;
            return this;
        }

        public RezervareBuilder setGenMuzica(String genMuzica) {
            this.genMuzica = genMuzica;
            return this;
        }

        @Override
        public Rezervare build() {
            return new Rezervare(this);
        }
    }
}
