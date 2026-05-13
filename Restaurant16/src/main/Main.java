package main;

import clase.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Client client=new Client("Maria","09090","@yahoo");

        Notificare mail=new NotificareMail();
        Notificare tel=new NotificareSMS();
        Notificare manager=new NotificareManager();

        tel.setNotificareurmatoare(mail);
        mail.setNotificareurmatoare(manager);

        ((Notificare)tel).trimiteNotificare(client);
    }
}