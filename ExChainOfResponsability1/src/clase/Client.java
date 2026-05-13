package clase;

public class Client {
    private String nume;
    private String tel;
    private String mail;

    public Client(String nume, String tel, String mail) {
        this.nume = nume;
        this.tel = tel;
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public String getNume() {
        return nume;
    }

    public String getTel() {
        return tel;
    }

}
