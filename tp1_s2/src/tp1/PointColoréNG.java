package tp1;

public class PointColoréNG extends Point<Integer> {
	private String couleur;

	public PointColoréNG(Integer abs, Integer ord, char nom, String couleur) {
		super(abs, ord, nom);
		this.couleur = couleur;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String toString() {
		return super.toString() + " couleur=" + couleur + "]";
	}

}
