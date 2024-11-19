/*
Cette classe décrit un zoo
 */

public class Zoo {
    
    public void nourrirAnimal(String type, String nom) {
        
        if (type.equals("Chien")) {
            System.out.println("Donner de la nourriture pour chien à " + nom);
            System.out.println(nom + " aboie après avoir mangé.");
        } else if (type.equals("Chat")) {
            System.out.println("Donner de la nourriture pour chat à " + nom);
            System.out.println(nom + " ronronne après avoir mangé.");
        } else if (type.equals("Oiseau")) {
            System.out.println("Donner des graines à " + nom);
            System.out.println(nom + " chante après avoir mangé.");
        } else {
            System.out.println("Type d'animal inconnu.");
        }
    }
    
}


abstract public class Animal{
    String type;
    String nom;

    public void nourrirAnimal(){
        System.out.println("Type d'animal inconnu.");
    }
}

public class chien extends Animal{
    @override
    public void nourrirAnimal(){
        System.out.println("Donner de la nourriture pour chien à " + nom);
        System.out.println(nom + " aboie après avoir mangé.");
    }
}

public class chat extends {
    @override
    public void nourrirAnimal(){
        System.out.println("Donner de la nourriture pour chat à " + nom);
        System.out.println(nom + " ronronne après avoir mangé.");
    }
}

public class oiseau extends Animal{
    @override
    public void nourrirAnimal(){
        System.out.println("Donner des graines à " + nom);
        System.out.println(nom + " chante après avoir mangé.");
    }
}
