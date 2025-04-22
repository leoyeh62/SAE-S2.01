package SAET;
import java.util.List;
import java.util.ArrayList;
public class StockGlobal extends StockEau {
	private List<StockEau> stock;
	
	public StockGlobal(Eau eau, entrepot entrepot, int quantite) {
		super(eau,entrepot,quantite);
		this.stock = new ArrayList<>();
	}
	 public List<StockEau> getStock() {
        return stock;
    }

    public void setStock(List<StockEau> stock) {
        this.stock = stock;
    }
	
	public void ajouterStock(StockEau nouveauStock) {
		for(int i=0;i<stock.size();i++) {
			if( stock.get(i).getEau().equals(nouveauStock.getEau()) && stock.get(i).getEntrepot().equals(nouveauStock.getEntrepot())) {
				int nouvelleQuantite = stock.get(i).getQuantite()+nouveauStock.getQuantite();
				stock.get(i).setQuantite(nouvelleQuantite);
				return;
			}
		}
		stock.add(nouveauStock);
	}
	
	public void reduireQuantite(int indice,int quantite) {
		if (indice >=0 && indice<stock.size()) {
			StockEau s = stock.get(indice);
			int nouvelleQuantite =s.getQuantite()-quantite;
			s.setQuantite(nouvelleQuantite);
		}
		
	}
	public void triParQuantite() {
		for(int i=0; i<stock.size();i++) {
			for(int j=i+1;j<stock.size();j++) {
				if(stock.get(i).getQuantite()> stock.get(j).getQuantite()) {
					StockEau tmp=stock.get(i);
					stock.set(i,stock.get(j));
					stock.set(j, tmp);
				}
			}
		}
	}

	@Override
	public String toString() {
		return "StockGlobal [stock=" + stock + "]";
	}

}
