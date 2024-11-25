public class Facture {
    public double calculerTotal(double montant, boolean clientVIP, boolean fraisLivraison) {
        double total = montant;
        if (clientVIP) {
            total += estVip(montant);
        }
        if (fraisLivraison) {
            total += fraisLivraison(montant);
        }
        return total;
    }
}

//renvoie le prix après calcul de la réduction de VIP
public double class estVip(double montant){
    if(montant>1000){
        return montant - montant * 0.1;
    }
    return montant;
}

//retourne le montant avec les frais de livraison
public double class fraisLivraison(montant){
    if(montant < 500){
        return montant + 20;
    }
    return montant;
}