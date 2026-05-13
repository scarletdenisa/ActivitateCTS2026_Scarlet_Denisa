package clase;

public class NotificareMail extends Notificare{
    @Override
    public void notifica(Client c, String mesaj) {
        if (c.getMail()!=null)
            System.out.println("Clientul "+c.getNume()+
                    " a primit mail cu mesajul "+ mesaj);
            else
                super.getNotificareUrmatoare().notifica(c, mesaj);
    }
}
