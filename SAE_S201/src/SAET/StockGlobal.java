package SAET;
import java.util.List;
import java.util.ArrayList;
public class StockGlobal extends StockEau {
	private List<StockEau> stock;
	//constructeur
	public StockGlobal(Eau eau, entrepot entrepot, int quantite) {
		super(eau,entrepot,quantite);
		this.stock = new ArrayList<>();
	}//getter
	 public List<StockEau> getStock() {
        return stock;
    }
    //setter
    public void setStock(List<StockEau> stock) {
        this.stock = stock;
    }
	//ajouter du stock à une ligne existante ou créer une nouvelle ligne dans la liste
	public void ajouterStock(StockEau nouveauStock) {
		if (nouveauStock == null) {
    			throw new IllegalArgumentException("Le stock à ajouter ne peut pas être null");
		}
		for(int i=0;i<stock.size();i++) {
			if( stock.get(i).getEau().equals(nouveauStock.getEau()) && stock.get(i).getEntrepot().equals(nouveauStock.getEntrepot())) {
				int nouvelleQuantite = stock.get(i).getQuantite()+nouveauStock.getQuantite();
				stock.get(i).setQuantite(nouvelleQuantite);
				return;
			}
		}
		stock.add(nouveauStock);
	}
	//retirer du stock dans la ligne existante
	public void reduireQuantite(int indice,int quantite) {
		if (indice >=0 && indice<stock.size()) {
			StockEau s = stock.get(indice);
			if (quantite > s.getQuantite()) {
       				 throw new IllegalArgumentException("Quantité à retirer supérieure au stock disponible");
   			}
			int nouvelleQuantite =s.getQuantite()-quantite;
			s.setQuantite(nouvelleQuantite);
		}
		
	}
	//trier la liste par quantité
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
	//méthode toString
	@Override
	public String toString() {
		return "StockGlobal [stock=" + stock + "]";
	}

}
