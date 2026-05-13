package clase;

public interface IAgentie {

    void trimiteMesaj(String mesaj);
    void aboneaza(IClient client);
    void dezaboneaza(IClient client);

}
