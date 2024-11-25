public class Facture {
    public double calculerTotal(double montant, boolean clientVIP, boolean fraisLivraison) {
        double total = montant;
        if (clientVIP) {
            if (montant > 1000) {
                total -= montant * 0.1; // Réduction de 10%
            }
        }
        if (fraisLivraison) {
            if (montant < 500) {
                total += 20; // Frais de livraison
            }
        }
        return total;
    }
}
