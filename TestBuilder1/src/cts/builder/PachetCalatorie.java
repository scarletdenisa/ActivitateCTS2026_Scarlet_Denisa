package cts.builder;

public class PachetCalatorie {
    private boolean areWifi;
    private boolean areAnimale;
    private boolean eFumator;
    private boolean areAC;
    private boolean areTV;

    private PachetCalatorie(PachetCalatorieBuilder builder) {
        this.areWifi = builder.areWifi;
        this.areAnimale = builder.areAnimale;
        this.eFumator = builder.eFumator;
        this.areAC = builder.areAC;
        this.areTV = builder.areTV;
    }

    public boolean isAreWifi() {
        return areWifi;
    }

    public boolean isAreAnimale() {
        return areAnimale;
    }

    public boolean iseFumator() {
        return eFumator;
    }

    public boolean isAreAC() {
        return areAC;
    }

    public boolean isAreTV() {
        return areTV;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetCalatorie{");
        sb.append("areWifi=").append(areWifi);
        sb.append(", areAnimale=").append(areAnimale);
        sb.append(", eFumator=").append(eFumator);
        sb.append(", areAC=").append(areAC);
        sb.append(", areTV=").append(areTV);
        sb.append('}');
        return sb.toString();
    }

    public static PachetCalatorieBuilder builder(){
        return new PachetCalatorieBuilder();
    }

    public static class PachetCalatorieBuilder implements Builder{
        private boolean areWifi;
        private boolean areAnimale;
        private boolean eFumator;
        private boolean areAC;
        private boolean areTV;

        public PachetCalatorieBuilder setAreWifi(boolean areWifi) {
            this.areWifi = areWifi;
            return this;
        }

        public PachetCalatorieBuilder setAreAnimale(boolean areAnimale) {
            this.areAnimale = areAnimale;
            return this;
        }

        public PachetCalatorieBuilder seteFumator(boolean eFumator) {
            this.eFumator = eFumator;
            return this;
        }

        public PachetCalatorieBuilder setAreAC(boolean areAC) {
            this.areAC = areAC;
            return this;
        }

        public PachetCalatorieBuilder setAreTV(boolean areTV) {
            this.areTV = areTV;
            return this;
        }

        @Override
        public PachetCalatorie build() {
            return new PachetCalatorie(this);
        }
    }
}
