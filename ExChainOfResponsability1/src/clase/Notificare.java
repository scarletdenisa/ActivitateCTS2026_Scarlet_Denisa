package clase;

public abstract class Notificare {
    private Notificare notificareUrmatoare;

    public Notificare getNotificareUrmatoare() {
        return notificareUrmatoare;
    }

    public void setNotificareUrmatoare(Notificare notificareUrmatoare) {
        this.notificareUrmatoare = notificareUrmatoare;
    }

    public abstract void notifica(Client c, String mesaj);
}
