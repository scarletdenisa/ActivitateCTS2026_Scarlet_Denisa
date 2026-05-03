package clase;

public class PachetTurstic implements InterfataPachetTuristic{

    private String hotel;
    private String destinatie;
    private boolean micDejun;
    private String cod;

    public PachetTurstic(String hotel, String cod, boolean micDejun, String destinatie) {
        this.hotel = hotel;
        this.cod = cod;
        this.micDejun = micDejun;
        this.destinatie = destinatie;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetTurstic{");
        sb.append("hotel='").append(hotel).append('\'');
        sb.append(", destinatie='").append(destinatie).append('\'');
        sb.append(", micDejun=").append(micDejun);
        sb.append(", cod=").append(cod);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaPachet(OptiuniPersoana optiuni) {
        StringBuilder sb = new StringBuilder("PachetTurstic{");
        sb.append("hotel='").append(hotel).append('\'');
        sb.append(", destinatie='").append(destinatie).append('\'');
        sb.append(", micDejun=").append(micDejun);
        sb.append(", cod=").append(cod);
        System.out.println(sb.toString()+optiuni.toString());
    }
}
