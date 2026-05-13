package clase;

public interface IRestaurant {
    void trimiteNotificare(String mesaj);
    void aboneaza(IClient c);
    void dezaboneaza(IClient c);
}
