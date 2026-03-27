package cts.exercitiu1.v2;

public class PachetTransport {
    private boolean hasWiFi;
    private boolean hasAnimale;
    private boolean isFumator;
    private boolean hasAC;
    private boolean hasTV;

    public PachetTransport(){

        this.hasWiFi=false;
        this.hasAnimale=false;
        this.isFumator=false;
        this.hasTV=false;
        this.hasAC=false;
    }

    public PachetTransport(boolean hasWiFi, boolean hasAnimale, boolean isFumator, boolean hasAC, boolean hasTV) {
        this.hasWiFi = hasWiFi;
        this.hasAnimale = hasAnimale;
        this.isFumator = isFumator;
        this.hasAC = hasAC;
        this.hasTV = hasTV;
    }

    public boolean isHasWiFi() {
        return hasWiFi;
    }

    public void setHasWiFi(boolean hasWiFi) {
        this.hasWiFi = hasWiFi;
    }

    public boolean isHasAnimale() {
        return hasAnimale;
    }

    public void setHasAnimale(boolean hasAnimale) {
        this.hasAnimale = hasAnimale;
    }

    public boolean isFumator() {
        return isFumator;
    }

    public void setFumator(boolean fumator) {
        isFumator = fumator;
    }

    public boolean isHasAC() {
        return hasAC;
    }

    public void setHasAC(boolean hasAC) {
        this.hasAC = hasAC;
    }

    public boolean isHasTV() {
        return hasTV;
    }

    public void setHasTV(boolean hasTV) {
        this.hasTV = hasTV;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetTransport{");
        sb.append("hasWiFi=").append(hasWiFi);
        sb.append(", hasAnimale=").append(hasAnimale);
        sb.append(", isFumator=").append(isFumator);
        sb.append(", hasAC=").append(hasAC);
        sb.append(", hasTV=").append(hasTV);
        sb.append('}');
        return sb.toString();
    }
}
