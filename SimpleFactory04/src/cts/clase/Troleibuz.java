package cts.clase;

public class Troleibuz extends MijlocTransport{
    public Troleibuz(int numarRoti, String numarImatriculare) {
        super(numarRoti, numarImatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb=new StringBuilder();
        sb.append("Troleibuzul are ");
        sb.append(super.numarRoti);
        sb.append(" roti si numarul de imatriculare este ");
        sb.append(super.numarImatriculare);
        System.out.println(sb.toString());
    }
}
