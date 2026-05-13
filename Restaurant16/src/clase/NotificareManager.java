package clase;

public class NotificareManager extends Notificare{
    @Override
    public void trimiteNotificare(Client c) {
            System.out.println("Clientul nu are numar de telefon si nic adresa de mail");
    }
}
