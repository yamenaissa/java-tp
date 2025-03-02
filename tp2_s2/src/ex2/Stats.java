package ex2;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class Stats {

	public static void afficherStatsEtudiants(Vector<Etudiant> etudiants) {
		for (Etudiant etudiant : etudiants) {
			System.out.println("Moyenne: " + etudiant.getValue());
			System.out.println("Meilleure note: " + etudiant.getMax());
			System.out.println("Moins bonne note: " + etudiant.getMin());
			System.out.println("-------------------");
		}
	}

	public void getMoyenneGroup(Vector<Etudiant> etudiants) {
		if (etudiants.isEmpty()) {
			System.out.println("Aucun étudiant dans le groupe.");
			return;
		}
		double moy = 0;
		for (Etudiant e : etudiants) {
			moy += e.getValue();
		}
		System.out.println("Moyenne du groupe : " + (moy / etudiants.size()));
	}

	public static Etudiant getMaximumGroupe(Vector<Etudiant> etudiants) {
		return Collections.max(etudiants, Comparator.comparing(Etudiant::getValue));
	}

	public static Etudiant getMinimumGroupe(Vector<Etudiant> etudiants) {
		return Collections.min(etudiants, Comparator.comparing(Etudiant::getValue));
	}
}
