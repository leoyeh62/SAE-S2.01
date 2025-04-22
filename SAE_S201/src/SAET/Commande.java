package SAET;
import java.util.ArrayList;
import java.util.List;

//classe qui représente les commandes passées par un client
public class Commande implements RemisesPossibles {
	private int compteur=0;
	private final int id;
	private final Client client;
	private final String date;
	private final List<LigneDeCommande> lignesDeCommande;
	
	//constructeur
	public Commande(Client client, String date) {
		this.id= ++compteur;
		this.client=client;
		this.date=date;
		this.lignesDeCommande = new ArrayList<>();
	}
	//getters
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
	
	//setters
	public void setClient(Client client) {
    	this.client = client;
	}
	
	public void setDate(String date) {
	    this.date = date;
	}
	
	public void setLignesDeCommande(List<LigneDeCommande> lignesDeCommande) {
	    this.lignesDeCommande = lignesDeCommande;
	}
	
	//ajout nouvelle ligne de commande
	public void ajouterLigneDeCommande(LigneDeCommande ligne) {
		if (ligne == null) {
   			 throw new IllegalArgumentException("La ligne de commande ne peut pas être null.");
		}
		lignesDeCommande.add(ligne);
	}
	
	//calcul du % de remise par rapport aux points de fidélité
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
	
	//calcul du nbr de bouteilles gratuites par rapport au total acheté selon le type de client
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
	
	//calcul du montant total
	public double montantTotal() {
		double total =0.0;
		for(int i=0; i<lignesDeCommande.size();i++) {
			total+=lignesDeCommande.get(i).getEau().getPrix() * lignesDeCommande.get(i).getQuantite();
		}
		double remise = montantDeLaRemise();
		total=total*(1-remise);
		return total;
	}
	//méthode toString
	@Override
	public String toString() {
		return "Commande [compteur=" + compteur + ", id=" + id + ", client=" + client + ", date=" + date
				+ ", lignesDeCommande=" + lignesDeCommande + "]";
	}
}
