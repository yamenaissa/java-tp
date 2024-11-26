package e1;

public class Film extends Evenement {
	private String producteur;
	private String genre;

	public Film(String titre, int duree, String[] noms, String realisateur, String producteur, String genre) {
		super(titre, duree, noms, realisateur);
		this.producteur = producteur;
		this.genre = genre;

	}

	@Override
	public String toString() {
		return super.toString() + " producteur=" + producteur + ", genre=" + genre + "]";
	}

	public String getProducteur() {
		return producteur;
	}

	public String getGenre() {
		return genre;
	}

}
