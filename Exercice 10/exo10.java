public class ValidateurUtilisateur {

    public boolean estValide(String nom, String email, int age) {
        if (nom == null || nom.isEmpty()) {
            System.out.println("Nom invalide.");
            return false;
        }

        if (email == null || !email.contains("@")) {
            System.out.println("Email invalide.");
            return false;
        }

        if (age <= 0) {
            System.out.println("Âge invalide.");
            return false;
        }

        return true;
    }
}
