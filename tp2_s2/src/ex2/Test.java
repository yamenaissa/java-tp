package ex2;

import java.util.Collections;
import java.util.Vector;

public class Test {
	public static void main(String[] args) {
		Vector<Etudiant> etudiants = new Vector<>(etudiants);

		Etudiant e1 = new Etudiant("123", "Alice");
		e1.addNote(new Note("Math", 15.0));
		e1.addNote(new Note("Physique", 17.0));

		Etudiant e2 = new Etudiant("456", "Bob");
		e2.addNote(new Note("Math", 12.0));
		e2.addNote(new Note("Physique", 14.0));

		Etudiant e3 = new Etudiant("789", "Charlie");
		e3.addNote(new Note("Math", 18.0));
		e3.addNote(new Note("Physique", 16.0));

		etudiants.add(e1);
		etudiants.add(e2);
		etudiants.add(e3);

		System.out.println("--- Statistiques des étudiants ---");
		Stats.afficherStatsEtudiants(etudiants);

		Stats stats = new Stats();
		stats.getMoyenneGroup(etudiants);
		System.out.println("Meilleur étudiant: " + Stats.getMaximumGroupe(etudiants).getNom());
		System.out.println("Moins bon étudiant: " + Stats.getMinimumGroupe(etudiants).getNom());

		System.out.println("\n--- Tri des étudiants par moyenne ---");
		Collections.sort(etudiants);
		for (Etudiant e : etudiants) {
			System.out.println(e.getNom() + " - Moyenne: " + e.getValue());
		}

		System.out.println("\n--- Tri des étudiants par matricule ---");
		Collections.sort(etudiants, new CompareMat());
		for (Etudiant e : etudiants) {
			System.out.println(e.getMatricule() + " - " + e.getNom());
		}

		System.out.println("\n--- Tri des étudiants par nom ---");
		Collections.sort(etudiants, new CompareNom());
		for (Etudiant e : etudiants) {
			System.out.println(e.getNom() + " - Matricule: " + e.getMatricule());
		}
	}
}
