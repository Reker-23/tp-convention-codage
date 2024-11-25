public class UserManager {
    public void gererUtilisateur(String action, String nom) {

        switch (action){
            case("ajouter") :
                ajouterUtilisateur(nom);
                break;
            case("supprimer"):
                supprimerUtilisateur(nom);
                break;
            case("chercher"):
                rechercheUtilisateur(nom);
                break;
            default :
                System.out.println("Action inconnu");
                break;
        }
    }

    public void ajouterUtilisateur(String nom){
            if (nomEstValide(nom)) {
                System.out.println("Utilisateur " + nom + " ajouté.");
            } else {
                System.out.println("Erreur : nom invalide.");
            }
    }

    public void supprimerUtilisateur(String nom){
                if (nomEstValide(nom)) {
                    System.out.println("Utilisateur " + nom + " supprimé.");
                } else {
                    System.out.println("Erreur : nom invalide.");
                }
        }

   public void rechercheUtilisateur(String nom){
       if (nomEstValide(nom)) {
           System.out.println("Recherche de l'utilisateur " + nom + ".");
       } else {
           System.out.println("Erreur : nom invalide.");
       }
   }

   public boolean nomEstValide(String nom){
       if (nom != null && !nom.isEmpty()) {
           return true;
       }
       return false;
   }
}


