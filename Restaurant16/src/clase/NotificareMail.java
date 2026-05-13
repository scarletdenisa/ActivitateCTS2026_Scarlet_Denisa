package clase;

public class NotificareMail extends Notificare{
    @Override
    public void trimiteNotificare(Client c) {
        if(c.getMail()!=null)
            System.out.println("clientul "+c.getNume()+" cu tel="+
                    c.getTel()+" si mail="+c.getMail()+" a primit notificarea prin mail");
        else
            super.getNotificareurmatoare().trimiteNotificare(c);
    }
}
