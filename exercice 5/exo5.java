/*
Cette classe gère des commandes
 */

public class CommandeManager {
    String status;
    boolean estUrgente;
    double montant;

    public void traiterCommande() { //vérifie si la commande est urgente

        if (commandeEstNouvelle()) {
            if (estUrgente) {
                System.out.println("Traiter la commande immédiatement.");
            } else {
                if (montant > 1000) { //applique une remise si la commande est conséquente
                    System.out.println("Appliquer une remise spéciale.");
                } else {
                    System.out.println("Traiter la commande normalement.");
                }
            }
        } else if (status.equals("ANNULEE")) { //
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