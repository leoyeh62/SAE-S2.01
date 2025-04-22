package SAET;

public class LigneDeCommande {
	private final Eau eau;
	private final int quantite;
	
	public LigneDeCommande(Eau eau,int quantite) {
		this.eau=eau;
		this.quantite=quantite;
	}
	
	public Eau getEau() {
		return eau;
	}
	public int getQuantite() {
		return quantite;
	}

}
