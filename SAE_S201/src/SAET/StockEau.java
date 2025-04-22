package SAET;

public class StockEau {
    private Eau eau;
    private entrepot entrepot;
    private int quantite;
	
    //Constructeur
    public StockEau(Eau eau, entrepot entrepot, int quantite) {
        this.eau = eau;
        this.entrepot = entrepot;
        this.quantite = quantite;
    }
    //getters
    public Eau getEau() {
        return eau;
    }

    public entrepot getEntrepot() {
        return entrepot;
    }

    public int getQuantite() {
        return quantite;
    }
    //setter
    public void setQuantite(int quantite) {
    	this.quantite=quantite;
    }

	@Override
	public String toString() {
		return "StockEau [eau=" + eau + ", entrepot=" + entrepot + ", quantite=" + quantite + "]";
	}
	
}
