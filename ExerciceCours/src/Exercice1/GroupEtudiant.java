package Exercice1;

import java.util.ArrayList;
import java.util.Collections;

public class GroupEtudiant {
    private ArrayList<Etudiant> etudiants;

    public GroupEtudiant() {
        this.etudiants = new ArrayList<>();
    }

    public void ajouterE(Etudiant e) {
        etudiants.add(e);
    }

    public void moyenneGroup() {
        if (etudiants.isEmpty()) {
            System.out.println("Aucun étudiant dans le groupe.");
            return;
        }

        double moy = 0;
        for (Etudiant e : etudiants) {
            moy += e.moyenne();
        }
        System.out.println("Moyenne du groupe : " + (moy / etudiants.size()));
    }

    public void meilleureE() {
        if (etudiants.isEmpty()) {
            System.out.println("Aucun étudiant dans le groupe.");
            return;
        }

        Etudiant max = etudiants.get(0);
        for (int i = 1; i < etudiants.size(); i++) {
            if (etudiants.get(i).moyenne() > max.moyenne()) {
                max = etudiants.get(i);
            }
        }
        System.out.println("Le meilleur étudiant : " + max);
    }

    public void moinsE() {
        if (etudiants.isEmpty()) {
            System.out.println("Aucun étudiant dans le groupe.");
            return;
        }

        Etudiant min = etudiants.get(0);
        for (int i = 1; i < etudiants.size(); i++) {
            if (etudiants.get(i).moyenne() < min.moyenne()) {
                min = etudiants.get(i);
            }
        }
        System.out.println("L'étudiant avec la plus faible moyenne : " + min);
    }
    
    public void trierMat() {
		Collections.sort(etudiants);
		for(Etudiant e:etudiants) {
			System.out.println(e);
		}

	}
    
    public void trierMoy() {
    	 Collections.sort(etudiants, new CompareMoyenne());
		for(Etudiant e:etudiants) {
			System.out.println(e);
		}

	}
    
    public void trierNom() {
    	Collections.sort(etudiants, new CompareNom());
		for(Etudiant e:etudiants) {
			System.out.println(e);
		}

	}
}
