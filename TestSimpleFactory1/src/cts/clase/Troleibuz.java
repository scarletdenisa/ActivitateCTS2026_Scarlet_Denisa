package cts.clase;

public class Troleibuz extends MijlocTransport{

    public Troleibuz(String numarImatriculare, String oras) {
        super(numarImatriculare, oras);
    }

    @Override
    public void afiseazaDescriere(){
        StringBuilder sb=new StringBuilder();
        sb.append("Troleibuzul are are numarul de imatriculare: ");
        sb.append(super.numarImatriculare);
        sb.append(" si este din orasul ");
        sb.append(super.oras);
        System.out.println(sb.toString());
    }
}
