/*
Cette classe gère des commandes
 */

public class CommandeManager {
    String status;
    boolean estUrgente;
    double montant;

    public void traiterCommande() {

        if (commandeEstNouvelle()) {
            if (estUrgente) {
                System.out.println("Traiter la commande immédiatement.");
            } else {
                if (montant > 1000) {
                    System.out.println("Appliquer une remise spéciale.");
                } else {
                    System.out.println("Traiter la commande normalement.");
                }
            }
        } else if (status.equals("ANNULEE")) {
            System.out.println("Commande annulée. Envoyer une notification au client.");
        } else {
            System.out.println("Statut de commande inconnu.");
        }
    }

    public boolean commandeEstNouvelle(){
        return status.equals("NOUVELLE");
    }

    public 


}