package tp;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Patient {
	private String nom;
	private Set<String> ordonnance;

	public Patient(String n) {
		this.nom = n;
		ordonnance=new HashSet<String>();
	}

	public String getNom() {
		return nom;
	}

	public boolean ordonnanceVide() {
		return ordonnance.isEmpty();
	}

	public void ajoutMedicament(String m) {
		ordonnance.add(m);
	}

	public void affiche() {
		System.out.println("Patient: " + nom);
		System.out.println("Ordonnance: ");
		if (ordonnanceVide()) {
			System.out.println("Aucun médicament");
		} else {
			for (String medicament : ordonnance) {
				System.out.println(", " + medicament);
			}
		}
	}
	
	public boolean contientMedicament(String m) {
		return ordonnance.contains(m);
	}
	
	public void trieOrdonnance() {
		Set<String> ordonnanceTriee = new TreeSet<>(ordonnance);
		ordonnance=ordonnanceTriee;
	}

	public Set<String> getOrdonnance() {
		return ordonnance;
	}

	public void setOrdonnance(Set<String> ordonnance) {
		this.ordonnance = ordonnance;
	}
	
	
	
}
