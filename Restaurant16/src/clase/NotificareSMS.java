package clase;

public class NotificareSMS extends Notificare{
    @Override
    public void trimiteNotificare(Client c) {
        if(c.getTel()!=null)
            System.out.println("clientul "+c.getNume()+" cu tel="+
                    c.getTel()+" si mail="+c.getMail()+" a primit notificarea prin sms");
        else super.getNotificareurmatoare().trimiteNotificare(c);
    }
}
