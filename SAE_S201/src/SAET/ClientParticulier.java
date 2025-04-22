package SAET;

public class ClientParticulier extends Client {
    private String nom;
    private String prenom;
    //Constructeur
    public ClientParticulier(int code, int dateInscription, Adresse adresse,String telephone, String mail, int pointsFidelite,String nom, String prenom) {
        super(code, dateInscription, adresse, telephone, mail, pointsFidelite);
        this.nom = nom;
        this.prenom = prenom;
    }
    //redéfinition de la méthode d'ajout de points de fidélité
    public void ajoutPointsFidelite(double achat) {
        double points = (achat / 100) * 10;
        this.pointsFidelite += points;
    }
    //getters
    public String getTypeClient() {
        return "Particulier";
    }
	public String getPrenom() {
        return prenom;
    }
	
    public String getNom() {
        return nom;
    }
    //setters
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
        //méthode toString
	@Override
	public String toString() {
		return "ClientParticulier [nom=" + nom + ", prenom=" + prenom + ", getCode()=" + getCode()
				+ ", getDateInscription()=" + getDateInscription() + ", getAdresse()=" + getAdresse()
				+ ", getTelephone()=" + getTelephone() + ", getMail()=" + getMail() + ", getPointsFidelite()="
				+ getPointsFidelite() + "]";
	}
    
    
}
