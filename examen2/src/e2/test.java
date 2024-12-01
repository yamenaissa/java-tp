package e2;

public class test {
	public static void main(String[] args) {
        Epreuve epreuve = new Epreuve("Mathématiques", 10);
        Candidat c1 = new Candidat(1, "Dupont");
        Candidat c2 = new Candidat(2, "Durand");
        Candidat c3 = new Candidat(3, "Martin");

        epreuve.ajoutCandidat(c1);
        epreuve.ajoutCandidat(c2);
        epreuve.ajoutCandidat(c3);

        try {
			epreuve.fixeResultat(1, new ResultatPoints(18));
		} catch (IllegalUpdateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			epreuve.fixeResultat(2, new ResultatPoints(15));
		} catch (IllegalUpdateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			epreuve.fixeResultat(3, new ResultatPoints(17));
		} catch (IllegalUpdateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        epreuve.terminer();

        System.out.println("Vainqueur : " + epreuve.getVainqueur().getNom());
        System.out.println("Meilleur résultat : " + epreuve.getRecord());
    }
}
