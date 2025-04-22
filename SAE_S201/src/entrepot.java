package Entrepot;

public class entrepot extends O_de_france {
	private String nom;
	private String adresse;
	private int code; 
	
	public entrepot (String adresse, String nom, int code) {
		this.adresse = adresse;
		this.nom = nom;
		this.code = code;
	}

}
