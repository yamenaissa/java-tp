package examenTP;

import java.time.LocalDate;

public class Agence {
	private Voiture[] lesVoitures;
	private String reference;
	private int nbVoitures;
	public int taille;

	public Agence(String ref, int taille) {
		super();
		this.lesVoitures = new Voiture[taille];
		this.reference = ref;
		this.nbVoitures = 0;
		this.taille = taille;
	}

	public void selectionne(Critere c) {
		if(c instanceof CriterePrix) {
			CriterePrix c1 = (CriterePrix) c;
			for (int i = 0; i < nbVoitures; i++) {
				if (c1.correspond(lesVoitures[i])) {
					System.out.println(lesVoitures[i].toString());
				}
			}
		}else if(c instanceof CritereMarque) {
			CritereMarque c1 = (CritereMarque) c;
			for (int i = 0; i < nbVoitures; i++) {
				if (c1.correspond(lesVoitures[i])) {
					System.out.println(lesVoitures[i].toString());
				}
			}
		}
	}

	public void ajoutVoiture(Voiture v) throws AjoutInterditException {
		if (nbVoitures > taille) {
			System.out.println("la table est saturée");
		} else {
			int age = LocalDate.now().getYear() - v.getAnnée();
			if (age > 5) {
				throw new AjoutInterditException("l'age du voiture depasse les 5 ans");
			} else {
				lesVoitures[nbVoitures] = v;
				nbVoitures++;
			}
		}
	}
}
