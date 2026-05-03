package clase;

public class NotaPlata implements INotaPlata{
    private double suma;
    private String data;

    public NotaPlata(double suma, String data) {
        this.suma = suma;
        this.data = data;
    }

    @Override
    public void printeaza() {

        System.out.println("Plata este in valoare de "+
                this.suma+" din data "+this.data);
    }
}
