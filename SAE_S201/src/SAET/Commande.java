package SAET;
import java.util.ArrayList;
import java.util.List;
public class Commande implements RemisesPossibles {
	private int compteur=0;
	private final int id;
	private final Client client;
	private final String date;
	private final List<LigneDeCommande> lignesDeCommande;
	
	public Commande(Client client, String date) {
		this.id= ++compteur;
		this.client=client;
		this.date=date;
		this.lignesDeCommande = new ArrayList<>();
	}
	public int getId() {
	    return id;
	}

	public Client getClient() {
	    return client;
	}

	public String getDate() {
	    return date;
	}

	public List<LigneDeCommande> getLignesDeCommande() {
	    return lignesDeCommande;
	}
	
	public void ajouterLigneDeCommande(LigneDeCommande ligne) {
		lignesDeCommande.add(ligne);
	}
	
	public double montantDeLaRemise() {
		double remise = client.getPointsFidelite()*0.001;
		if (client.getTypeClient().equals("Particulier")) {
			if (remise >0.10) {
				remise=0.10;
			}
		}else {
			if(remise>0.05) {
				remise=0.05;
			}
		}
		return remise;
		
	}
	
	public int nombreBouteillesGratuites() {
		int nbrBoutteilles = 0;
		for (int i =0; i< lignesDeCommande.size(); i++) {
			nbrBoutteilles += lignesDeCommande.get(i).getQuantite();
		}
		if (client.getTypeClient().equals("Particulier")) {
			return nbrBoutteilles/5;
		}else {
			return nbrBoutteilles/10;
		}
	}
	

	public double montantTotal() {
		double total =0.0;
		for(int i=0; i<lignesDeCommande.size();i++) {
			total+=lignesDeCommande.get(i).getEau().getPrix() * lignesDeCommande.get(i).getQuantite();
		}
		double remise = montantDeLaRemise();
		total=total*(1-remise);
		return total;
	}
	
	@Override
	public String toString() {
		return "Commande [compteur=" + compteur + ", id=" + id + ", client=" + client + ", date=" + date
				+ ", lignesDeCommande=" + lignesDeCommande + "]";
	}
}
