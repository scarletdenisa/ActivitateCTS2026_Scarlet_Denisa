package clase;

public class PachetTuristic {
    private int idPachet;
    private String destinatie;
    private IPlata plata;

    public PachetTuristic(int idPachet, String destinatie) {
        this.idPachet = idPachet;
        this.destinatie = destinatie;
        this.plata = new PlataCard();
    }

    public void setPlata(IPlata plata) {
        this.plata = plata;
    }

    public void plateste(){
        System.out.println("Pachetu cu id="+this.idPachet+
                " si destinatia="+this.destinatie+", ");
        plata.detaliazaPlata();
    }
}
