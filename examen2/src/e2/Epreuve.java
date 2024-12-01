package e2;

import java.util.Arrays;

public class Epreuve {
	private String denomination;
	private int maxParticipants;
	private int n;
	private Candidat[] candidats;
	private boolean terminee;
	private Resultat[] resultats;

	public Epreuve(String denomination, int maxParticipants) {
		this.denomination = denomination;
		this.maxParticipants = maxParticipants;
		this.candidats = new Candidat[maxParticipants];
		this.resultats = new Resultat[maxParticipants];
		this.n = 0;
		this.terminee = false;
	}

	@Override
	public String toString() {
		return "Epreuve [denomination=" + denomination + ", maxParticipants=" + maxParticipants + ", candidats="
				+ Arrays.toString(candidats) + ", terminee=" + terminee + "]";
	}

	public void ajoutCandidat(Candidat c) {
		if (n < maxParticipants) {
			candidats[n] = c;
			n++;
		} else {
			throw new IllegalStateException("Le nombre maximum de participants est atteint.");
		}
	}

	public void terminer() {
		terminee = true;
	}

	public boolean estTerminee() {
		return terminee;
	}

	public Resultat getRecord() {
		Resultat best = null;
		for (Resultat r : resultats) {
			if (r != null && (best == null || r.getScore() > best.getScore())) {
				best = r;
			}
		}
		return best;
	}

	public Candidat getVainqueur() {
		if (!terminee) {
			throw new IllegalStateException("L'épreuve n'est pas terminée.");
		}
		Resultat best = getRecord();
		if (best == null)
			return null;

		for (int i = 0; i < n; i++) {
			if (resultats[i] != null && resultats[i].equals(best)) {
				return candidats[i];
			}
		}
		return null;
	}

	public void fixeResultat(int id, Resultat r) throws IllegalUpdateException {
		if (terminee) {
			throw new IllegalUpdateException("Impossible de modifier les résultats d'une épreuve terminée.");
		}
		boolean found = false;
		for (int i = 0; i < n; i++) {
			if (candidats[i].getId() == id) {
				resultats[i] = r;
				found = true;
				break;
			}
		}
		if (!found) {
			throw new IllegalArgumentException("Le participant avec l'ID " + id + " n'est pas inscrit.");
		}
	}

	public Resultat getResultat(int id) {
		for (int i = 0; i < n; i++) {
			if (candidats[i].getId() == id) {
				return resultats[i];
			}
		}
		return null;
	}
}
