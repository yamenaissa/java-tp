package ex2;

public class Note implements Comparable<Note> {
	private String NomCours;
	private double note;

	public double getNote() {
		return note;
	}

	public void setNote(double note) {
		this.note = note;
	}

	public Note(String string, double note) {
		this.note = note;
		this.NomCours=string;
	}

	@Override
	public int compareTo(Note o) {
		if (this.note > o.note) {
			return 1;
		}
		if (this.note < o.note) {
			return -1;
		} else {
			return 0;
		}
	}
}
