package clase;

public class SoftTerestru implements InterfataAutobuz{
    private int idAbonament;

    public SoftTerestru(int idAbonament) {
        this.idAbonament = idAbonament;
    }

    private boolean areAbonament(){
        if (idAbonament!=0)
            return true;
        else return false;
    }

    private void valideazaAbonamentul(){
        System.out.println(areAbonament()?"Abonamentul la autobuz a fost validat":
                "Calatorul nu are abonament");
    }

    @Override
    public void rezervaBilet() {
        valideazaAbonamentul();
    }
}
