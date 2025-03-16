package Exercice;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Entreprise {
	private String nomEntreprise;
	HashMap<Integer, Departement> Liste_Deps;

	public String getNomEntreprise() {
		return nomEntreprise;
	}

	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}

	public HashMap<Integer, Departement> getListe_Deps() {
		return Liste_Deps;
	}

	public void setListe_Deps(HashMap<Integer, Departement> liste_Deps) {
		Liste_Deps = liste_Deps;
	}

	public Entreprise(String nomE) {
		this.nomEntreprise = nomE;
		this.Liste_Deps = new HashMap<>();
	}

	public void ajoutDep(Departement d) {
		Liste_Deps.put(d.getIdDep(), d);
	}

	public void retirerDep(Departement d) {
		Liste_Deps.remove(d.getIdDep());
	}

	public void afficheE() {
		System.out.println("\nEntreprise: " + nomEntreprise);
		System.out.println("Départements:");
		for (Map.Entry<Integer, Departement> entry : Liste_Deps.entrySet()) {
			entry.getValue().afficheDep();
		}
	}

	public void UpdateDep(Employé E, int idDep) {
		Liste_Deps.get(E.idDepartement).retirerEmploye(E);
		Liste_Deps.get(idDep).ajoutEmploye(E);
	}

	public boolean existeD(Departement d) {
		return Liste_Deps.containsValue(d);
	}

	public void DepMinCapacity() {
		if (Liste_Deps.isEmpty()) {
			System.out.println("L'entreprise n'a aucun département.");
			return;
		}
		TreeMap<Integer, Departement> triee = new TreeMap<>();
		for (Departement dep : Liste_Deps.values()) {
			triee.put(dep.getLEmployes().size(), dep);
		}
		Map.Entry<Integer, Departement> firstEntery = triee.firstEntry();
		Departement depMin = firstEntery.getValue();
		System.out.println("Département avec le moins d'employés:");
		depMin.afficheDep();
	}
}