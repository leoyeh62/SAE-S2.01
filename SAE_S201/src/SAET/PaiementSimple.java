package SAET;


public class PaiementSimple implements TraitementPaiement {

    public void executePaiement(Paiement paiement) {
        paiement.getMethode().payer(paiement.getMontant());
    }

    public void remboursement(Paiement paiement) {
        paiement.getMethode().rembourser(paiement.getMontant());
    }
}