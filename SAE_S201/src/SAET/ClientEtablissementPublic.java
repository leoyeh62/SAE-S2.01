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
	
	public void ajoutPointsFidelite(double achat) {
        double points = (achat / 500) * 10;
        this.pointsFidelite += points;
    }

    public String getTypeClient() {
        return "EtablissementPublic";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

	@Override
	public String toString() {
		return "ClientEtablissementPublic [nom=" + nom + ", type=" + type + ", getCode()=" + getCode()
				+ ", getDateInscription()=" + getDateInscription() + ", getAdresse()=" + getAdresse()
				+ ", getTelephone()=" + getTelephone() + ", getMail()=" + getMail() + ", getPointsFidelite()="
				+ getPointsFidelite() + "]";
	}

}
