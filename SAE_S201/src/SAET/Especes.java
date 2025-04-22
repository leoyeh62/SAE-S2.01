package SAET;

public class CarteBancaire extends MethodePaiement {
	public void payer(double montant) {
		System.out.println("paiement de "+montant+" euros fait par carte banquaire");
	}
	public void rembourser(double montant) {
		System.out.println("remboursement de "+montant+" euros fait par carte banquaire");
	}


}
