package kata5p2.model;

public class Mail {
    
    public static boolean isMail(String line){
        return line.matches("^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$");
    }
    
    private final String mail;
    
    public Mail(String mail){
        this.mail = mail;
    }
    
    public String getDomain(){
        return this.mail.substring(this.mail.indexOf("@") + 1);
    }

}
