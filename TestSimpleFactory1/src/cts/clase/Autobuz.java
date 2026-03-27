package cts.clase;

public class Autobuz extends MijlocTransport{

    public Autobuz(String numarImatriculare, String oras) {
        super(numarImatriculare, oras);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb=new StringBuilder();
        sb.append("Autobuzul are numarul de imatriculare: ");
        sb.append(super.numarImatriculare);
        sb.append(" si este din orasul ");
        sb.append(super.oras);
        System.out.println(sb.toString());
    }
}
