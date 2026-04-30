package clase;

public class Client implements ClientAbstract{
    private String nume;
    private String telefon;
    private String mail;

    protected Client(String nume, String mail, String telefon) {
        this.nume = nume;
        this.mail = mail;
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", telefon='").append(telefon).append('\'');
        sb.append(", mail='").append(mail).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaRezervare(Rezervare rezervare) {
        final StringBuilder sb = new StringBuilder("Clientul ");
        sb.append("nume='").append(nume);
        sb.append(", telefon='").append(telefon);
        sb.append(", mail='").append(mail).append(" are rezervarea: ");
        System.out.println(sb.toString()+rezervare.toString());
    }

    @Override
    public void realizeazaPlata(Rezervare rezervare,double taxaPerPersoana) {
        System.out.println("Clientul trebuie sa plateasca "+
                rezervare.getNrPersoane()*taxaPerPersoana);

    }
}
