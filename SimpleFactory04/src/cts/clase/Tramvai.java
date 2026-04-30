package cts.clase;

public class Tramvai extends MijlocTransport{
    public Tramvai(int numarRoti, String numarImatriculare) {
        super(numarRoti, numarImatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb=new StringBuilder();
        sb.append("Tramvaiul are ");
        sb.append(super.numarRoti);
        sb.append(" roti si numarul de imatriculare este ");
        sb.append(super.numarImatriculare);
        System.out.println(sb.toString());
    }
}
