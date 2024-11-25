public class Calculateur {
    public double calculerPourClientNormal(double montant) {
        double total = montant * 1.2; // TVA 20%
        return total;
    }

    public double calculerPourClientVIP(double montant) {
        double total = montant * 1.2; // TVA 20%
        total -= montant * 0.1; // Réduction 10%
        return total;
    }
}
