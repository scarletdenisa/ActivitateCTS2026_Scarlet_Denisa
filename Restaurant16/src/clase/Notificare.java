package clase;

public abstract class Notificare {
    private Notificare notificareurmatoare;

    public Notificare getNotificareurmatoare() {
        return notificareurmatoare;
    }

    public void setNotificareurmatoare(Notificare notificareurmatoare) {
        this.notificareurmatoare = notificareurmatoare;
    }

    public abstract void trimiteNotificare(Client c);
}
