package SAET;

public class StockEau {
    private Eau eau;
    private Entrepot entrepot;
    private int quantite;

    public StockEau(Eau eau, Entrepot entrepot, int quantite) {
        this.eau = eau;
        this.entrepot = entrepot;
        this.quantite = quantite;
    }

    public Eau getEau() {
        return eau;
    }

    public Entrepot getEntrepot() {
        return entrepot;
    }

    public int getQuantite() {
        return quantite;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
