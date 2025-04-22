package SAET;
//déclaration de l'interface TraitementPaiement
public interface TraitementPaiement {
	void executePaiement(Paiement paiement);
	void remboursement(Paiement paiement);
}
