package main;

import clase.Hotel;
import clase.InterfataHotel;
import clase.Rezervare;
import proxy.ProxyRezervare;

//Camerele rezervate la hotel au anularea rezervării în mod gratuit. Managerul
//ia decizia ca această anulare să fie gratuită doar pentru rezervările de maxim
//o noapte. Să se implementeze un modul prin care să se permită anularea
//rezervării doar pentru rezervările de cel mult o noapte
public class Main {
    public static void main(String[] args) {
        InterfataHotel hotel=new Hotel("Aurelius");
        Rezervare rezervare=new Rezervare("#3456",5);
        Rezervare rezervare1=new Rezervare("#9874",1);

        ProxyRezervare proxyRezervare=new ProxyRezervare(hotel);
        proxyRezervare.anuleazaRezervare(rezervare);
        proxyRezervare.anuleazaRezervare(rezervare1);
    }
}