package main;

import clase.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Client cl=new Client("Ion",null,"null");
        Notificare tel=new NotificareSms();
        Notificare mail=new NotificareMail();
        Notificare manager=new NotificareManager();

        tel.setNotificareUrmatoare(mail);
        mail.setNotificareUrmatoare(manager);

        tel.notifica(cl,"vino");
    }
}