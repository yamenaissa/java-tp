package e1;

public class Theatre extends Evenement {
	private String auteur;

	public Theatre(String titre, int duree, String[] noms, String realisateur, String auteur) {
		super(titre, duree, noms, realisateur);
		this.auteur = auteur;
	}

	@Override
	public String toString() {
		return super.toString() + " auteur=" + auteur + "]";
	}

	public String getAuteur() {
		return auteur;
	}

}
