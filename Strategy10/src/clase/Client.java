package clase;
//atrb,constr,setteri
public class Client {
    private ModalitateaDePlata modalitateaDePlata;
    private String nume;

    public Client(String nume) {
        this.nume = nume;
        this.modalitateaDePlata=new PlataCard(200);
    }

    //setter
    public void setModalitateaDePlata(ModalitateaDePlata modalitateaDePlata) {
        this.modalitateaDePlata = modalitateaDePlata;
    }

    public void platesteSuma(double suma){
        modalitateaDePlata.plateste(this.nume,suma);
    }
}
