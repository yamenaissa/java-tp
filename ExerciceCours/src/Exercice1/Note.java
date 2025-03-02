package Exercice1;

public class Note {
	private String NomCours;
	private double note;

	public double getNote() {
		return note;
	}

	public void setNote(double note) {
		this.note = note;
	}

	public Note(double note, String ncours) {
		this.NomCours=ncours;
		this.note = note;
	}

	@Override
	public String toString() {
		return "Note [NomCours=" + NomCours + ", note=" + note + "]";
	}
	
}
