package Exercice1;

import java.util.ArrayList;
import java.util.Iterator;


public class Etudiant implements Comparable<Etudiant>{
	private String matricule;
	private String nom;
	private ArrayList<Note> notes;

	public Etudiant(String matricule, String nom) {
		this.matricule = matricule;
		this.nom = nom;
		this.notes = new ArrayList<>();
	}


	public String getMatricule() {
		return matricule;
	}


	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public void setNotes(ArrayList<Note> notes) {
		this.notes = notes;
	}


	public ArrayList<Note> getNotes() {
		return notes;
	}

	public void ajouter(Double lanote, String Cours) {
		this.notes.add(new Note(lanote,Cours));
	}
	
	public void afficher() {
		System.out.println("les ootes de l'etudiant : /n");
		for(Note n:notes) {
			System.out.println(n);
		}
	}
	
	public void NoteMeilleure() {
		double max = notes.get(0).getNote();
	    for (int i = 1; i < notes.size(); i++) {
	        if (notes.get(i).getNote() > max) {
	            max = notes.get(i).getNote();
	        }
	    }
	    System.out.println("La meilleure note : " + max);
	}
	
	public void NoteMauvaise() {
		double min = notes.get(0).getNote();
		for (int i = 0; i < notes.size(); i++) {
			if (notes.get(i).getNote() < min) {
				min = notes.get(i).getNote();
			}
		}
		System.out.println("la mauvaise note : "+ min);
	}
	
	public Double moyenne() {
		double moy = 0;
		for(Note n:notes) {
			moy+=n.getNote();
		}
		return moy/notes.size();
	}
	
	@Override
	public String toString() {
		return "Etudiant [matricule=" + matricule + ", nom=" + nom + ", notes=" + notes + "]";
	}


	@Override
	public int compareTo(Etudiant o) {
	    return this.matricule.compareTo(o.matricule);
	}

}