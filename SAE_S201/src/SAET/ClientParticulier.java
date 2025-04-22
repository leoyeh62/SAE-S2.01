package SAET;

public class ClientParticulier extends Client {
    private String nom;
    private String prenom;

    public ClientParticulier(int code, int dateInscription, Adresse adresse,String telephone, String mail, int pointsFidelite,String nom, String prenom) {
        super(code, dateInscription, adresse, telephone, mail, pointsFidelite);
        this.nom = nom;
        this.prenom = prenom;
    }

    public void ajoutPointsFidelite(double achat) {
        double points = (achat / 100) * 10;
        this.pointsFidelite += points;
    }

    public String getTypeClient() {
        return "Particulier";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
