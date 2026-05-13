package clase;

public class Rezervare implements IRezervare{
    private int nrPers;
    private String ora;
    private String data;

    public Rezervare(int nrPers, String ora, String data) {
        this.nrPers = nrPers;
        this.ora = ora;
        this.data = data;
    }

    public int getNrPers() {
        return nrPers;
    }



    @Override
    public void afiseazaRezervare() {
        StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nrPers=").append(nrPers);
        sb.append(", ora='").append(ora).append('\'');
        sb.append(", data='").append(data).append('\'');
        sb.append('}');
        System.out.println(sb.toString());
    }
}
