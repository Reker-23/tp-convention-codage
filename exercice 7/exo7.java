public class Calculateur {
    boolean vip;
    public double calculerPourClient(double montant){
        montant += montant * 1.2;// TVA 20%

        if(vip){
            montant *=0.9;// Réduction 10%
        }
        return montant;
    }
}

