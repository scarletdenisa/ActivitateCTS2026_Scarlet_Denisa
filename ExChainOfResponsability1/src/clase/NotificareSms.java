package clase;

public class NotificareSms extends Notificare{
    @Override
    public void notifica(Client c, String mesaj) {
        if(c.getTel()!=null){
            System.out.println("Clientul "+c.getNume()+" a primit sms cu mesajul "+
                    mesaj);
        }else
            super.getNotificareUrmatoare().notifica(c, mesaj);
    }
}
