package SAET;

import java.util.ArrayList;
import java.util.List;

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
        this.stockGlobal = new StockGlobal(null, null, 0); // À ajuster selon ta logique métier
    }
// Gestion des clients
public void ajouterClient(Client client) {
    clients.add(client);
}

public List<Client> getClients() {
    return clients;
}

public List<ClientParticulier> getClientsParticuliers() {
    List<ClientParticulier> particuliers = new ArrayList<>();
    for (Client c : clients) {
        if (c instanceof ClientParticulier) {
            particuliers.add((ClientParticulier) c);
        }
    }
    return particuliers;
}

public List<ClientEntreprise> getClientsEntreprises() {
    List<ClientEntreprise> entreprises = new ArrayList<>();
    for (Client c : clients) {
        if (c instanceof ClientEntreprise) {
            entreprises.add((ClientEntreprise) c);
        }
    }
    return entreprises;
}


public Client rechercherClientParCode(int code) {
    for (Client c : clients) {
        if (c.getCode() == code) {
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
        if (c.getId() == id) {
            return c;
        }
    }
    return null;
}

// Gestion des paiements
public void traiterPaiement(Paiement paiement, TraitementPaiement stratégie) { // Methode qui permet de traiter le paiement avec comme argument "Paiement paiement" qui contient le montant a payer et la methode de paiement
    stratégie.executePaiement(paiement);
    paiements.add(paiement);
}

public void rembourserPaiement(Paiement paiement, TraitementPaiement stratégie) {
    stratégie.remboursement(paiement);
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

}}