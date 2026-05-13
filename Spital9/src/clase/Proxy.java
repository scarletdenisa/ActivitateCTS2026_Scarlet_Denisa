package clase;

public class Proxy implements ISpital {
    private ISpital persoana;

    public Proxy(ISpital persoana) {
        this.persoana = persoana;
    }

    @Override
    public void afiseazaInternare(Persoana p) {
        if (p.isAreAsigurare()){
            persoana.afiseazaInternare(p);
        }
        else System.out.println("Persoana nu are asigurare");
    }
}
