package clase;

public class NotaDePlata implements INotaDePlata{
    private String data;
    private int id;

    public NotaDePlata(String data, int id) {
        this.data = data;
        this.id = id;
    }

    @Override
    public void printeazaNota() {
        System.out.println("Nota de plata "+this.id+" din data "+
                this.data+" a fost printata ");
    }
}
