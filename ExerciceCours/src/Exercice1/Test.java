package Exercice1;

public class Test {
    public static void main(String[] args) {
        // Creating students with unique notes
        Etudiant e1 = new Etudiant("7", "Mohamed");
        e1.ajouter(13.0, "arabic");
        e1.ajouter(12.0, "java");
        e1.ajouter(14.0, "francais");
        e1.ajouter(9.0, "si");

        Etudiant e2 = new Etudiant("1", "Ahmed");
        e2.ajouter(13.7, "arabic");
        e2.ajouter(11.0, "java");
        e2.ajouter(18.0, "francais");
        e2.ajouter(15.0, "si");

        Etudiant e3 = new Etudiant("5", "Fatima");
        e3.ajouter(17.0, "arabic");
        e3.ajouter(11.5, "java");
        e3.ajouter(11.0, "francais");
        e3.ajouter(10.0, "si");

        Etudiant e4 = new Etudiant("4", "Sara");
        e4.ajouter(9.0, "arabic");
        e4.ajouter(13.7, "java");
        e4.ajouter(14.0, "francais");
        e4.ajouter(9.0, "si");

        // Creating a group and adding students
        GroupEtudiant g = new GroupEtudiant();
        g.ajouterE(e1);
        g.ajouterE(e2);
        g.ajouterE(e3);
        g.ajouterE(e4);

        // Running methods
        g.meilleureE();
        g.moinsE();
        g.moyenneGroup();
        System.out.println("=== Tri par Matricule ===");
        g.trierMat();
        System.out.println("\n=== Tri par Moyenne ===");
        g.trierMoy();
        System.out.println("\n=== Tri par Nom ===");
        g.trierNom();
    }
}
