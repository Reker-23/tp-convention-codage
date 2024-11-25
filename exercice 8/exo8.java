public class UserManager {
    public void gererUtilisateur(String action, String nom) {
        if (action.equals("ajouter")) {
            if (nom != null && !nom.isEmpty()) {
                System.out.println("Utilisateur " + nom + " ajouté.");
            } else {
                System.out.println("Erreur : nom invalide.");
            }
        } else if (action.equals("supprimer")) {
            if (nom != null && !nom.isEmpty()) {
                System.out.println("Utilisateur " + nom + " supprimé.");
            } else {
                System.out.println("Erreur : nom invalide.");
            }
        } else if (action.equals("rechercher")) {
            if (nom != null && !nom.isEmpty()) {
                System.out.println("Recherche de l'utilisateur " + nom + ".");
            } else {
                System.out.println("Erreur : nom invalide.");
            }
        } else {
            System.out.println("Action inconnue.");
        }
    }
}
