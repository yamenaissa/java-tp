package e1;

import java.util.Arrays;

public class Evenement {
	private String titre;
	private int duree;
	private String[] acteurs;
	private String realisateur;

	public Evenement(String titre, int duree, String[] noms, String realisateur) {
		this.titre = titre;
		this.duree = duree;
		this.acteurs = noms;
		this.realisateur = realisateur;
	}

	public String getTitre() {
		return titre;
	}

	public int getDuree() {
		return duree;
	}

	public String getRealisateur() {
		return realisateur;
	}

	@Override
	public String toString() {
		return "Evenement [titre=" + titre + ", duree=" + duree + ", noms=" + Arrays.toString(acteurs)
				+ ", realisateur=" + realisateur;
	}

	public boolean acteurIn(String s) {
		for (int i = 0; i < acteurs.length; i++) {
			if (acteurs[i].equals(s))
				return true;
		}
		return false;

	}
}
