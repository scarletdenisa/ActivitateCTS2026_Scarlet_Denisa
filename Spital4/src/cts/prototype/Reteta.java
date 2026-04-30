package cts.prototype;

public class Reteta implements IReteta{
    protected int cod;
    protected String data;
    protected int nrComponente;
    protected boolean esteActualizata;

    public Reteta(){

    }

    public Reteta(int cod, String data, int nrComponente, boolean esteActualizata) {
        this.cod = cod;
        this.data = data;
        this.nrComponente = nrComponente;
        this.esteActualizata = esteActualizata;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getNrComponente() {
        return nrComponente;
    }

    public void setNrComponente(int nrComponente) {
        this.nrComponente = nrComponente;
    }

    public boolean isEsteActualizata() {
        return esteActualizata;
    }

    public void setEsteActualizata(boolean esteActualizata) {
        this.esteActualizata = esteActualizata;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("cod=").append(cod);
        sb.append(", data='").append(data).append('\'');
        sb.append(", nrComponente=").append(nrComponente);
        sb.append(", esteActualizata=").append(esteActualizata);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public IReteta copiere() {
        Reteta reteta=new Reteta();
        reteta.cod=this.cod;
        reteta.data=this.data;
        reteta.esteActualizata=this.esteActualizata;
        reteta.nrComponente=this.nrComponente;
        return reteta;
    }
}
