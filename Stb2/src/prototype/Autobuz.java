package prototype;

public class Autobuz implements IAutobuz{

    private int roti;
    private String oras;
    private boolean esteDublu;

    private Autobuz(){

    }

    public Autobuz(int roti, String oras, boolean esteDublu) {
        this.roti = roti;
        this.oras = oras;
        this.esteDublu = esteDublu;
    }

    public int getRoti() {
        return roti;
    }

    public void setRoti(int roti) {
        this.roti = roti;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public boolean isEsteDublu() {
        return esteDublu;
    }

    public void setEsteDublu(boolean esteDublu) {
        this.esteDublu = esteDublu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("roti=").append(roti);
        sb.append(", oras='").append(oras).append('\'');
        sb.append(", esteDublu=").append(esteDublu);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public IAutobuz copiere() {
        Autobuz autobuz=new Autobuz();
        autobuz.oras=this.oras;
        autobuz.roti=this.roti;
        autobuz.esteDublu=this.esteDublu;
        return autobuz;
    }
}
