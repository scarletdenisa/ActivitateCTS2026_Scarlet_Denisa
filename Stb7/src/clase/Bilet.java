package clase;

public class Bilet implements IBilet{
    private int nr;

    public Bilet(int nr) {
        this.nr = nr;
    }

    @Override
    public void printeazaBilet() {
        System.out.println("Biletul cu nr "+this.nr+
                " a fost printat");
    }
}
