/*
Cette classe décrit un animal
 */

public class animal {

    public String nom;
    public int age;

    public void parler();

}


public class chien  extends {

    @override
    public void parler(){
        System.out.println("Woof woof");
    }

    public void decrire(){
        System.out.println("Type: chien, Nom: "+nom+", Âge: "+age+" ans");
    }
}

public class chat extends animal {

    @override
    public void parler(){
        System.out.println("Miaou");
    }

    public void decrire(){
        System.out.println("Type: chat, Nom: "+nom+", Âge: "+age+" ans");
    }
}