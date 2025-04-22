package SAET;

public class ClientEtablissementPublic extends Client{	
	private String nom;
	private enum Type {EPIC,EPA,EPSCT}
	private Type type;
	//constructeur
	public ClientEtablissementPublic(int code, int dateInscription, Adresse adresse,String telephone, String mail, int pointsFidelite,String nom,Type type) {
        super(code, dateInscription, adresse, telephone, mail, pointsFidelite);
        this.nom = nom;
        this.type = type;
    }
	//redéfinition de la méthode d'ajout de points de fidélités
	public void ajoutPointsFidelite(double achat) {
        double points = (achat / 500) * 10;
        this.pointsFidelite += points;
    }
    //getters
    public String getTypeClient() {
        return "EtablissementPublic";
    }
	public Type getType() {
        return type;
    }

    public String getNom() {
        return nom;
    }
    //setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setType(Type type) {
        this.type = type;
    }
        //méthode toString
	@Override
	public String toString() {
		return "ClientEtablissementPublic [nom=" + nom + ", type=" + type + ", getCode()=" + getCode()
				+ ", getDateInscription()=" + getDateInscription() + ", getAdresse()=" + getAdresse()
				+ ", getTelephone()=" + getTelephone() + ", getMail()=" + getMail() + ", getPointsFidelite()="
				+ getPointsFidelite() + "]";
	}

}
