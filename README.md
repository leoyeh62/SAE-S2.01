# SAE-S2.01

http://download.eclipse.org/egit/updates

git@github.com:leoyeh62/SAE-S2.01.git


package SAET;

import java.util.*;

public class EntrepriseVenteEau {
    private String nom;
    private List<Client> clients;
    private List<Commande> commandes;
    private List<Paiement> paiements;
    private List<entrepot> entrepots;
    private StockGlobal stockGlobal;  

    public EntrepriseVenteEau(String nom) {
        this.nom = nom;
        this.clients = new ArrayList<>();
        this.commandes = new ArrayList<>();
        this.paiements = new ArrayList<>();
        this.entrepots = new ArrayList<>();
        this.stockGlobal = new StockGlobal(null, null, 0);  // Initialisation avec un stock global vide
    }

    // Gestion des clients
    public void ajouterClient(Client client) {
        clients.add(client);
    }

    public List<Client> getClients() {
        return clients;
    }

    public Client rechercherClientParNom(String nom) {
        for (Client c : clients) {
            if (c.getNom().equals(nom)) { // Comparaison sensible à la casse
                return c;
            }
        }
        return null;
    }
    
    

    // Gestion des entrepôts
    public void ajouterEntrepot(entrepot e) {
        entrepots.add(e);
    }

    // Gestion des stocks
    public void ajouterStock(Eau eau, entrepot entrepot, int quantite) {
        // Ajouter un stock spécifique dans un entrepôt
        StockEau s = new StockEau(eau, entrepot, quantite);
        stockGlobal.ajouterStock(s);
    }

    public StockGlobal getStockGlobal() {
        return stockGlobal;
    }

    // Gestion des commandes
    public void ajouterCommande(Commande commande) {
        commandes.add(commande);
    }

    public List<Commande> getCommandes() {
        return commandes;
    }

    public Commande rechercherCommandeParId(int id) {
        for (Commande c : commandes) {
            if (c.getIdCommande() == id) {
                return c;
            }
        }
        return null;
    }

    // Gestion des paiements
    public void traiterPaiement(Paiement paiement, TraitementPaiement strategie) {
        strategie.executePaiement(paiement);
        paiements.add(paiement);
    }

    public void rembourserPaiement(Paiement paiement, TraitementPaiement strategie) {
        strategie.remboursement(paiement);
    }

    public List<Paiement> getPaiements() {
        return paiements;
    }

    // Affichage global de l'entreprise
    @Override
    public String toString() {
        return "EntrepriseVenteEau{" +
                "nom='" + nom + '\'' +
                ", clients=" + clients +
                ", commandes=" + commandes +
                ", paiements=" + paiements +
                ", entrepots=" + entrepots +
                ", stockGlobal=" + stockGlobal +
                '}';
    }
}
