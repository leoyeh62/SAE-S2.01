package SAET;

public class LigneDeCommande {
	private final Eau eau;
	private final int quantite;
	
	//constructueur
	public LigneDeCommande(Eau eau,int quantite) {
		this.eau=eau;
		this.quantite=quantite;
	}
	//getters
	public Eau getEau() {
		return eau;
	}
	public int getQuantite() {
		return quantite;
	}
	//méthode ToString
	@Override
public String toString() {
    return "LigneDeCommande [eau=" + eau + ", quantite=" + quantite + "]";
}
}
