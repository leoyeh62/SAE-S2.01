package SAET;

import java.util.ArrayList;
import java.util.List;

import SAET.Eau.Type;

public class TestEntrepriseVenteEau {

    public static void main(String[] args) {
        // Créer une instance d'EntrepriseVenteEau
        EntrepriseVenteEau entreprise = new EntrepriseVenteEau("LeoSoif");

        // Test de l'ajout de clients
        System.out.println("\n   Test de l'ajout de clients    ");
        ClientParticulier cp1 = new ClientParticulier(1, 0, null, "Alice", "123 rue de lens", 1, null, null);// "ClientParticulier" Methode pour ajouter un client particulier on gagne du temps a ne pas faire une methode pour chaque type de clien
        ClientEntreprise ce1 = new ClientEntreprise(0, 0, null, "Eau4Ever", "666 avenue des sources", 2, null, 0);// Pareil
        entreprise.ajouterClient(cp1);
        entreprise.ajouterClient(ce1);

        // Afficher les clients
        System.out.println("Clients Particuliers: " + entreprise.getClientsParticuliers());
        System.out.println("Clients Entreprises: " + entreprise.getClientsEntreprises());

        // Test de la recherche d'un client par code
        System.out.println("\n   Test de recherche par code    ");
        Client clientTrouve = entreprise.rechercherClientParCode(1);
        System.out.println(clientTrouve);

        // Test de l'ajout d'un entrepôt
        System.out.println("\n    Test de l'ajout d'entrepôt    ");
        entrepot e1 = new entrepot("Lille", "Entrepôt Nord", 101);
        entreprise.ajouterEntrepot(e1);

        // Test de l'ajout d'un stock
        System.out.println("\n   Test de l'ajout de stock    ");
        Eau vittel = new Eau(1,"Vittel", 1.5,Type.Gazeuse);
        entreprise.ajouterStock(vittel, e1, 100);

        // Afficher le stock global
        System.out.println("Stock Global: " + entreprise.getStockGlobal());

        // Test de l'ajout d'une commande
        System.out.println("\n    Test de l'ajout de commande    ");
        List<LigneDeCommande> lignes = new ArrayList<>();
        lignes.add(new LigneDeCommande(vittel, 10)); // 10 bouteilles
        Commande commande1 = new Commande(cp1, "2025-04-22");
        entreprise.ajouterCommande(commande1);

        // Afficher les commandes
        System.out.println("Commandes: " + entreprise.getCommandes());

        // Test de la recherche d'une commande par ID
        System.out.println("\n    Test de recherche par ID de commande    ");
        Commande commandeTrouvee = entreprise.rechercherCommandeParId(1);
        System.out.println("Commande trouvée : " + commandeTrouvee);
        
        // Test de paiement
        System.out.println("\n    Test de paiement    ");

        // Création d'une carte bancaire (classe concrète qui implémente MethodePaiement)
        MethodePaiement carteBancaire = new CarteBancaire();
        System.out.println(carteBancaire);

        // Création d’un paiement avec la méthode de paiement choisie
        Paiement paiement = new Paiement(8.0, carteBancaire); // Paiement de 8€
        System.out.println(paiement);

        // Création de la stratégie de traitement
        TraitementPaiement paiementSimple = new PaiementSimple();
        System.out.println(paiementSimple);

        // Traitement du paiement via l'entreprise
        entreprise.traiterPaiement(paiement, paiementSimple);

        // Afficher les paiements enregistrés
        System.out.println("Paiements: " + entreprise.getPaiements());

        // Test du remboursement
        System.out.println("\n    Test de remboursement    ");
        entreprise.rembourserPaiement(paiement, paiementSimple);

        // Afficher à nouveau la liste des paiements (inchangée, mais peut loguer le remboursement)
       System.out.println("Paiements: " + entreprise.getPaiements());

    }
}
