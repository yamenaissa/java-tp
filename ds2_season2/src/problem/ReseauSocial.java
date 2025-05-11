package problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ReseauSocial {
	HashMap<Personne, ArrayList<Personne>> reseau;

	public ReseauSocial() {
		reseau = new HashMap<Personne, ArrayList<Personne>>();
	}

	public void ajouterUtilisateur(Personne p) {
		if (!reseau.containsKey(p)) {
			reseau.put(p, new ArrayList<Personne>());
		}
	}

	public void AjouterSuiveur(Personne p, Personne p1) {
		if (!reseau.containsKey(p)) {
			ajouterUtilisateur(p);
		}
		ArrayList<Personne> suiveurs = reseau.get(p);
		if (suiveurs.contains(p1)) {
			System.out.println("Le suiveur existe déjà.");
		} else {
			suiveurs.add(p1);
		}
	}

	public HashSet<Personne> ListeUtilisateursSuivis() {
		HashSet<Personne> utilisateursSuivis = new HashSet<Personne>();

		for (Personne p : reseau.keySet()) {
			if (!reseau.get(p).isEmpty()) {
				utilisateursSuivis.add(p);
			}
		}

		return utilisateursSuivis;
	}

}
