public class CalculateurPrix {

    public double calculerPrixTotal(int quantite, String categorie) {
        double prixUnitaire = 0;

        if (categorie.equals("Standard")) {
            prixUnitaire = 10.0;
        } else if (categorie.equals("Premium")) {
            prixUnitaire = 20.0;
        } else if (categorie.equals("Luxe")) {
            prixUnitaire = 50.0;
        }

        if (quantite > 10) {
            return (prixUnitaire * quantite) * 0.9; // 10% de réduction pour les commandes en gros
        } else {
            return prixUnitaire * quantite;
        }
    }
}
