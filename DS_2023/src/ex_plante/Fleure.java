package ex_plante;

public class Fleure extends Plante {
	protected String couleur;
	protected int moisF;

	public Fleure(String string2, int k, int i, double d, String string, int j) {
		super(string2, k, i, d);
		couleur = string;
		moisF = j;
	}

	public String getCouleur() {
		return couleur;
	}

	public void description() {
		System.out.println(super.toString());
		System.out.println(this);
	}

	public String toString() {
		return "couleur: " + couleur + ", moisf: " + moisF;
	}

	public void fleurir() {
		if (moisF != 5 || moisF != 6 || moisF != 4) {
			System.out.println("La fleure n'est pas en fleure");
		} else {
			System.out.println("cette fleur est en fleurs");
		}
	}

}
