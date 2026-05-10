package clase;

public class Sectie implements Structura{
    private int nrSectie;
    private int nrAngajati;

    public Sectie(int nrSectie, int nrAngajati) {
        this.nrSectie = nrSectie;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public void afiseazaStructura(String spatii) {
        System.out.println(spatii+"Sectia "+this.nrSectie+
                " are "+this.nrAngajati+" angajati");
    }
}
