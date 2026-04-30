package inchiriereMasina;

public class Masina {
    private String marca;
    private double capacitateMotor;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masina{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", capacitateMotor=").append(capacitateMotor);
        sb.append('}');
        return sb.toString();
    }

    public Masina(String marca, double capacitateMotor) {
        this.marca = marca;
        this.capacitateMotor = capacitateMotor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCapacitateMotor() {
        return capacitateMotor;
    }

    public void setCapacitateMotor(double capacitateMotor) {
        this.capacitateMotor = capacitateMotor;
    }
}
