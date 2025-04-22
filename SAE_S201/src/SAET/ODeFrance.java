package SAET;

public class ODeFrance {

    public static void main(String[] args) {
    	// Eau 
        Eau eau1 = new Eau(1, "Evian", 1.5, Eau.Type.Plate);
        Eau eau2 = new Eau(2, "Perrier", 1.8, Eau.Type.Gazeuse);

        // Entrepôts
        entrepot entrepotA = new entrepot("10 rue des Lilas", "Entrepôt A", 75000);
        entrepot entrepotB = new entrepot("5 avenue des Champs", "Entrepôt B", 69000);

        // StockEau
        StockEau stock1 = new StockEau(eau1, entrepotA, 100);
        StockEau stock2 = new StockEau(eau2, entrepotB, 200);
        
        
        // Stock Global	
        StockGlobal stockGlobal = new StockGlobal(eau1, entrepotA, 0); 
        stockGlobal.ajouterStock(stock1);
        
        
        // Test de création d'une Adresse avec Commune
        Adresse.Commune communeLyon = new Adresse.Commune("69123", "Lyon", "Rhône");
        Adresse adresseLyon = new Adresse(25, "Rue Victor Hugo", communeLyon);
        System.out.println("Adresse créée : " + adresseLyon.getNumero() + " " + adresseLyon.getVoie() +
                           ", Commune = " + adresseLyon.getCommune().getCommune() + 
                           ", Département = " + adresseLyon.getCommune().getDepartement() +
                           ", INSEE = " + adresseLyon.getCommune().getINSEE());

        // Test de création d'un ClientEntreprise (meme principe pour les deux autres types de Client)
        Adresse.Commune communeLens = new Adresse.Commune("62200", "Lens", "Pas-De-Calais");
        Adresse adresseEntreprise = new Adresse(100, "Rue de L'univerisité", communeLens);
        ClientEntreprise entreprise = new ClientEntreprise(2001, 20230101, adresseEntreprise, "01567451522", "contact@entreprise.fr", 120, "NettSpend", 123456789);
        entreprise.ajoutPointsFidelite(5000);
        System.out.println("ClientEntreprise : " + entreprise.Getnom() + ", SIRET = " + entreprise.GetSIRET() + ", Points fidélité = " + entreprise.getPointsFidelite());

    }
}
