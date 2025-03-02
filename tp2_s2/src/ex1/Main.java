package ex1;

public class Main {
    public static void main(String[] args) {
        TacheElementaire t1 = new TacheElementaire("Tâche 1", 10);
        TacheElementaire t2 = new TacheElementaire("Tâche 2", 20);
        
        TacheComplexe projet = new TacheComplexe("Projet");
        projet.ajouter(t1);
        projet.ajouter(t2);
        
        System.out.println("Coût total du projet: " + projet.getCout());
    }
}
