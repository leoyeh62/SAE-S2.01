package SAET;

public class ClientEntreprise extends Client {
	private String nom;
	private int SIRET;
		
    public ClientEntreprise(int code, int dateInscription, Adresse adresse,String telephone, String mail, int pointsFidelite,String nom,int SIRET) {
        super(code, dateInscription, adresse, telephone, mail, pointsFidelite);
        this.nom = nom;
        this.SIRET = SIRET;
    }
    
    public void ajoutPointsFidelite(double achat) {
        double points = (achat / 1000) * 10;
        this.pointsFidelite += points;
    }

    public String getTypeClient() {
        return "Entreprise";
    }
    
    public String Getnom() {
    	return nom;
    }
    
    public int GetSIRET() {
    	return SIRET;
    }
    
    public void SetNom(String nom) {
    	this.nom=nom;
    }
    
    public void SetSIRET(int SIRET) {
    	this.SIRET=SIRET;
    }

}
