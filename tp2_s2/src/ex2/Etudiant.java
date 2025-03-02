package ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Etudiant implements IStatisticable {
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

	public void addNote(Note note) {
		notes.add(note);
	}

	public Double getMax() {
		Collections.sort(notes);
		return notes.get(notes.size() - 1).getNote();

	}

	public Double getMin() {
		double min = notes.get(0).getNote();
		for (int i = 0; i < notes.size(); i++) {
			if (notes.get(i).getNote() < min) {
				min = notes.get(i).getNote();
			}
		}
		return min;
	}

	@Override
	public float getValue() {
		float moy = 0;
		Iterator<Note> it = notes.iterator();
		while (it.hasNext()) {
			Note n = it.next();
			moy += it.next().getNote();
		}
		return moy / notes.size();
	}

	@Override
	public String toString() {
		return "Etudiant [matricule=" + matricule + ", nom=" + nom + ", notes=" + notes + "]";
	}

	@Override
	public int compareTo(Etudiant autre) {
		return Float.compare(this.getValue(), autre.getValue());
	}
}