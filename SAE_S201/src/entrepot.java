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
	public setAdresse(String addresse){
		this.addresse=addresse;
	}
	public setNom(String nom){
		this.nom=nom;
	}
	public setCode(int code){
		this.code=code;
	}
	public getCode(){
		return code;
	}
	public getAdresse(){
		return adresse;
	}
	public getNom(){
		return nom;
	}

}
