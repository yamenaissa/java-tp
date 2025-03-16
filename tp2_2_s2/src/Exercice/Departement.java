package Exercice;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Departement {
	private int idDep;
	Set<Employé> LEmployes;

	public Departement(int idDep) {
		this.idDep = idDep;
		LEmployes = new HashSet();
	}

	public void ajoutEmploye(Employé E) {
		if (E.cin > 0) {
			LEmployes.add(E);
			E.setIdDepartement(this.idDep);
		}
	}

	public void retirerEmploye(Employé E) {
		LEmployes.remove(E);
	}

	public void afficheDep() {
		System.out.println("Département ID: " + idDep);
		System.out.println("Employés:");
		for (Employé employe : LEmployes) {
			System.out.println("  " + employe);
		}
	}

	public boolean existeE(int cin) {
		return LEmployes.contains(new Employé(cin, "", 0.0, 0));
	}

	public Employé getEmpMax() {
		TreeSet<Employé> ts = new TreeSet<>(LEmployes);
		return ts.last();
	}

	public int getIdDep() {
		return idDep;
	}

	public void setIdDep(int idDep) {
		this.idDep = idDep;
	}

	public Set<Employé> getLEmployes() {
		return LEmployes;
	}

	public void setLEmployes(Set<Employé> lEmployes) {
		LEmployes = lEmployes;
	}

}
