package SAET;

public class Especes extends MethodePaiement {
	public void payer(double montant) {
		System.out.println("paiement de "+montant+" euros fait par Espèces");
	}
	public void rembourser(double montant) {
		System.out.println("remboursement de "+montant+" euros fait par Espèces");
	}


}
