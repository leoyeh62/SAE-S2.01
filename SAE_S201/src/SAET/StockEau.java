package SAET;

public class StockEau {
    private Eau eau;
    private entrepot entrepot;
    private int quantite;

    public StockEau(Eau eau, entrepot entrepot, int quantite) {
        this.eau = eau;
        this.entrepot = entrepot;
        this.quantite = quantite;
    }

    public Eau getEau() {
        return eau;
    }

    public entrepot getEntrepot() {
        return entrepot;
    }

    public int getQuantite() {
        return quantite;
    }
    
    public void setQuantite(int quantite) {
    	this.quantite=quantite;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "StockEau [eau=" + eau + ", entrepot=" + entrepot + ", quantite=" + quantite + "]";
	}
	
}
