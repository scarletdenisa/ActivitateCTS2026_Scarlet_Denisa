package clase;

public class Autobuz {
    private String marca;
    private int pasageri;

    public Autobuz(String marca, int pasageri) {
        this.marca = marca;
        this.pasageri = pasageri;
    }

    public void pleaca(int nrlinie){
        System.out.println("Autobuzul "+this.marca+" cu nr pasageri="+
                this.pasageri+" a aplecat pe traseul "+nrlinie);
    }
}
