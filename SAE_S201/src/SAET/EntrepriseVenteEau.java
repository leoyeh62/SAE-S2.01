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
    // On ajoute des clients grace a la classe clients
public void ajouterClient(Client client) {
    clients.add(client);  // Utilisation du add pour ajouter le client dans la liste clients
}

// Retourne la liste clients 
public List<Client> getClients() {
    return clients;
}

    // renvoie uniquement les clients particuliers grace a instance of
public List<ClientParticulier> getClientsParticuliers() {
    List<ClientParticulier> particuliers = new ArrayList<>(); // création d'une liste pour les clients particuliers
    for (Client c : clients) { // boucle on parcourt chaque client dans la liste clients 
        if (c instanceof ClientParticulier) { // Instance of test si c appartient a la sous-classe ClientParticulier
            particuliers.add((ClientParticulier) c);// ajout du client dans la liste du ClientParticulier
        }
    }
    return particuliers;// on retourne la liste des Clients Particuliers 
}

    // renvoie uniquement les clients Entreprises grace a instance of (meme principe que pour les clients particuliers)
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
    for (Client c : clients) { //  boucle on parcourt chaque client dans la liste clients 
        if (c.getCode() == code) { // si le code du client est egal au code en argument alors on le retourne
            return c;
        }
    }
    return null; // sinon null
}

// Gestion des entrepôts
    //on ajoute des entrepots grace a la classe entreprot
public void ajouterEntrepot(entrepot e) {
    entrepots.add(e);
}

// Gestion des stocks
    //méthode pour ajouter du stock qui prend en argument l'eau, l'entrepot et sa quantité
public void ajouterStock(Eau eau, entrepot entrepot, int quantite) {
    // Ajouter un stock spécifique dans un entrepôt
    StockEau s = new StockEau(eau, entrepot, quantite);
    stockGlobal.ajouterStock(s);// on ajoute le stock ajouter dans stockglobal afin qu'il represente l'ensemble du stock de l'entreprise
}
//getteur pour le stock globlal
public StockGlobal getStockGlobal() {
    return stockGlobal;
}

// Gestion des commandes
    // on ajoute des commandes dans la liste commandes
public void ajouterCommande(Commande commande) {
    commandes.add(commande);
}
// on retourne la liste commandes
public List<Commande> getCommandes() {
    return commandes;
}

public Commande rechercherCommandeParId(int id) {
    for (Commande c : commandes) { //  boucle on parcourt chaque client dans la liste clients
        if (c.getId() == id) { // si l'id de commande est égal a l'id en argument alors on retourne la commande
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
