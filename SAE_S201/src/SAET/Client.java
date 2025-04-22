package SAET;

public abstract class Client {
    private int code;
    private int dateInscription; 
    private Adresse adresse;
    private String telephone;
    private String mail;
    protected int pointsFidelite;

    public Client(int code, int dateInscription, Adresse adresse, String telephone, String mail, int pointsFidelite) {
        this.code = code;
        this.dateInscription = dateInscription;
        this.adresse = adresse;
        this.telephone = telephone;
        this.mail = mail;
        this.pointsFidelite = pointsFidelite;
    }

    public abstract void ajoutPointsFidelite(double achat);
    public abstract String getTypeClient();


    public int getCode() {
        return code;
    }

    public int getDateInscription() {
        return dateInscription;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getMail() {
        return mail;
    }

    public int getPointsFidelite() {
        return pointsFidelite;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPointsFidelite(int pointsFidelite) {
        this.pointsFidelite = pointsFidelite;
    }
}

