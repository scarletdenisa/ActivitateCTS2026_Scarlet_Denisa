package clase;

public class SoftBar implements Bar{
    private int an;

    public SoftBar(int an) {
        this.an = an;
    }

    public void afiseazaDetalii(){
        System.out.println(esteNou()?
                "Softul de la bar a fost cumparat dupa 2010":
                "Softul de la bar este vechi");
    }

    private boolean esteNou(){
        if(this.an>=2010)
            return true;
        else return false;
    }
}
