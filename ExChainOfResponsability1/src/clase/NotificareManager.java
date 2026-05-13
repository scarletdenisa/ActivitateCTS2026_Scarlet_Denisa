package clase;

public class NotificareManager extends Notificare{
    @Override
    public void notifica(Client c, String mesaj) {
        System.out.println("Clientul "+c.getNume()+" nu are tel si mail");
    }
}
