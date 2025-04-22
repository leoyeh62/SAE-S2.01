package SAET;

public class entrepot extends ODeFrance {
	private String nom;
	private String adresse;
	private int code; 
	
	public entrepot (String adresse, String nom, int code) {
		super();
		this.adresse = adresse;
		this.nom = nom;
		this.code = code;
	}
	public  void setAdresse(String addresse){
		this.adresse=addresse;
	}
	public void setNom(String nom){
		this.nom=nom;
	}
	public void setCode(int code){
		this.code=code;
	}
	public int getCode(){
		return code;
	}
	public String getAdresse(){
		return adresse;
	}
	public String getNom(){
		return nom;
	}
	@Override
	public String toString() {
		return "entrepot [nom=" + nom + ", adresse=" + adresse + ", code=" + code + "]";
	}

}