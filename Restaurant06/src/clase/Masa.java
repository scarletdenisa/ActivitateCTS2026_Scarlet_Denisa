package clase;

public class Masa {
    private int idMasa;
    private int nrPersoane;
    private int oreDeLaPlecareaUltimuluiClient;
    private int nrServetele;

    public Masa(int idMasa, int nrPersoane, int oreDeLaPlecareaUltimuluiClient, int nrServetele) {
        this.idMasa = idMasa;
        this.nrPersoane = nrPersoane;
        this.oreDeLaPlecareaUltimuluiClient = oreDeLaPlecareaUltimuluiClient;
        this.nrServetele = nrServetele;


    }

    public int getIdMasa() {
        return idMasa;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public int getOreDeLaPlecareaUltimuluiClient() {
        return oreDeLaPlecareaUltimuluiClient;
    }

    public int getNrServetele() {
        return nrServetele;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masa{");
        sb.append("idMasa=").append(idMasa);
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", oreDeLaPlecareaUltimuluiClient=").append(oreDeLaPlecareaUltimuluiClient);
        sb.append(", nrServetele=").append(nrServetele);
        sb.append('}');
        return sb.toString();
    }
}
