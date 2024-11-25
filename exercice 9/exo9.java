public class Analyseur {
    public void analyserDonnees(int[] donnees) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int somme = 0;

        for (int valeur : donnees) {
            if (valeur < min) {
                min = valeur;
            }
            if (valeur > max) {
                max = valeur;
            }
            somme += valeur;
        }

        double moyenne = (double) somme / donnees.length;

        System.out.println("Minimum : " + min);
        System.out.println("Maximum : " + max);
        System.out.println("Moyenne : " + moyenne);
    }
}
