package clase;

public class Camera implements ICamera{
    private int prosoape;
    private int cearsafuri;
    private int perne;
    private int umerase;
    private int nrCamera;

    public Camera(int prosoape, int cearsafuri, int perne, int umerase,int nrCamera) {
        this.prosoape = prosoape;
        this.cearsafuri = cearsafuri;
        this.perne = perne;
        this.umerase = umerase;
        this.nrCamera=nrCamera;
    }

    @Override
    public void afiseazaDetalii(State state) {
        System.out.println("Camera are prosoape="+this.prosoape+
                " cearsafuri="+this.cearsafuri+" perne="+
                this.perne+" umerase="+this.umerase+" nr camera="+
                this.nrCamera+state.toString());
    }
}
