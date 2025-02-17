package tp1;

public class PointColoré<t, t2> extends Point<t> {
	private t2 couleur;

	public PointColoré(t abs, t ord, char nom, t2 couleur) {
		super(abs, ord, nom);
		this.couleur = couleur;
	}

	public t2 getCouleur() {
		return couleur;
	}

	public void setCouleur(t2 couleur) {
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		return super.toString() + " couleur=" + couleur + "]";
	}

}
