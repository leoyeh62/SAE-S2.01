package SAET;

public class Paiement {
    private double montant;
    private MethodePaiement methode;
    //Constructeur 		
    public Paiement(double montant, MethodePaiement methode) {
    	if (montant < 0) {
            throw new NullPointerException("Le montant ne peut pas etre inférieur a 0");
        }
    	if (methode == null) {
            throw new NullPointerException("La méthode de paiement ne peut pas être nulle");
        }
        this.montant = montant;
        this.methode = methode;
    }
    //getters
    public double getMontant() {
        return montant;
    }

    public MethodePaiement getMethode() {
        return methode;
    }
	//méthode toString
	@Override
	public String toString() {
		return "Paiement [montant=" + montant + ", methode=" + methode + "]";
	}
	
}
