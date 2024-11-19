public class Veterinaire {
    public void soignerAnimal(String type, String nom) {
        if (type.equals("Chien")) {
            System.out.println("Soins pour le chien " + nom);
            System.out.println("Examen des pattes");
            System.out.println("Injection de vaccin");
        } else if (type.equals("Chat")) {
            System.out.println("Soins pour le chat " + nom);
            System.out.println("Examen des griffes");
            System.out.println("Nettoyage des oreilles");
        }
    }
}