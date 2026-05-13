package clase;

public abstract class Modul {
    private Modul modulUrmator;

    public Modul getModulUrmator() {
        return modulUrmator;
    }

    public void setModulUrmator(Modul modulUrmator) {
        this.modulUrmator = modulUrmator;
    }

    public abstract void recomandaTransport(Calator c);
}
