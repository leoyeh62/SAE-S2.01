package SAET;


public class PaiementSimple implements TraitementPaiement {
    /**
     * Exécute un paiement en utilisant la méthode de paiement spécifiée dans l'objet Paiement.
     *
     * @param paiement l'objet contenant les informations nécessaires pour payer (montant et méthode de paiement)
     */
    public void executePaiement(Paiement paiement) {
        paiement.getMethode().payer(paiement.getMontant());
    }
    /**
     * Effectue un remboursement en utilisant la méthode de paiement spécifiée dans l'objet Paiement.
     *
     * @param paiement l'objet contenant les informations nécessaires pour rembourser (montant et méthode de paiement)
     */
    public void remboursement(Paiement paiement) {
        paiement.getMethode().rembourser(paiement.getMontant());
    }
}
