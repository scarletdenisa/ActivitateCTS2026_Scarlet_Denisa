package cts.clasa;

public class Lidl {
    private int nrAngajati;
    private String oras;
    private boolean esteRenovat;

    private Lidl(int nrAngajati, String oras, boolean esteRenovat) {
        this.nrAngajati = nrAngajati;
        this.oras = oras;
        this.esteRenovat = esteRenovat;
    }

    private static Lidl instance=null;

    public static synchronized Lidl getInstance(int nrAngajati, String oras, boolean esteRenovat){
        if(instance==null)
            instance=new Lidl(nrAngajati, oras, esteRenovat);
        return  instance;
    }

    public void descrie(){
        StringBuilder sb = new StringBuilder("Lidl: ");
        sb.append("nrAngajati=").append(this.nrAngajati);
        sb.append(", oras='").append(this.oras);
        sb.append(", esteRenovat=").append(this.esteRenovat);
        System.out.println(sb.toString());
    }
}
