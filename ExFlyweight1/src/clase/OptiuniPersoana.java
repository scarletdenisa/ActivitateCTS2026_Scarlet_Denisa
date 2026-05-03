package clase;

public class OptiuniPersoana {
    private boolean cinaInclusa;
    private int nrExcursiiPerZi;

    public OptiuniPersoana(boolean cinaInclusa, int nrExcursiiPerZi) {
        this.cinaInclusa = cinaInclusa;
        this.nrExcursiiPerZi = nrExcursiiPerZi;
    }

    public boolean isCinaInclusa() {
        return cinaInclusa;
    }

    public int getNrExcursiiPerZi() {
        return nrExcursiiPerZi;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persoana alege{");
        sb.append("cinaInclusa=").append(cinaInclusa);
        sb.append(", nrExcursiiPerZi=").append(nrExcursiiPerZi);
        sb.append('}');
        return sb.toString();
    }
}
