package cts.exercitiu1.v3;


public class PachetCazare {
    private boolean hasWiFi;
    private boolean hasAnimale;
    private boolean isFumator;
    private boolean hasAC;
    private boolean hasTV;

    private PachetCazare(PachetCazareBuilder builder){
        this.hasWiFi=builder.hasWiFi;
        this.hasAnimale=builder.hasAnimale;
        this.isFumator=builder.isFumator;
        this.hasAC=builder.hasAC;
        this.hasTV=builder.hasTV;
    }

    public static PachetCazareBuilder builder() {
        return new PachetCazareBuilder();
    }

    public boolean isHasWiFi() {
        return hasWiFi;
    }

    public boolean isHasAnimale() {
        return hasAnimale;
    }

    public boolean isFumator() {
        return isFumator;
    }

    public boolean isHasAC() {
        return hasAC;
    }

    public boolean isHasTV() {
        return hasTV;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetCazare{");
        sb.append("hasWiFi=").append(hasWiFi);
        sb.append(", hasAnimale=").append(hasAnimale);
        sb.append(", isFumator=").append(isFumator);
        sb.append(", hasAC=").append(hasAC);
        sb.append(", hasTV=").append(hasTV);
        sb.append('}');
        return sb.toString();
    }

    public static class PachetCazareBuilder implements Builder{

        private boolean hasWiFi;
        private boolean hasAnimale;
        private boolean isFumator;
        private boolean hasAC;
        private boolean hasTV;


        @Override
        public PachetCazare build() {
            return new PachetCazare(this);
        }

        public PachetCazareBuilder setHasWiFi(boolean hasWiFi) {
            this.hasWiFi = hasWiFi;
            return this;
        }

        public PachetCazareBuilder setHasAnimale(boolean hasAnimale) {
            this.hasAnimale = hasAnimale;
            return this;
        }

        public PachetCazareBuilder setFumator(boolean fumator) {
            isFumator = fumator;
            return this;
        }

        public PachetCazareBuilder setHasAC(boolean hasAC) {
            this.hasAC = hasAC;
            return this;
        }

        public PachetCazareBuilder setHasTV(boolean hasTV) {
            this.hasTV = hasTV;
            return this;
        }
    }
}
