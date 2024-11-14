package tp5;

public class Fiscalité {
	public static void main(String[] args) {
		Personne p1 = new Personne(1, " John", " Doe");
		Personne p2 = new Personne(2, " Aissa", " Yamen");
		Personne p3 = new Personne(3, "Jackson ", " Lara");

		Lotissement l = new Lotissement(5);
		l.ajouter(new ProprietePrivee(1, p1, "Corniche", 350, 4));
		l.ajouter(new Villa(2, p2, "Dar Chabeen", 400, 6, true));
		l.ajouter(new Appartment(3, p2, "Hammamet", 1200, 8, 3));
		l.ajouter(new PropriétéProfessionnelle(4, p3, "Korba", 1000, 50, true));
		l.ajouter(new PropriétéProfessionnelle(5, p1, "Bir Bouragba", 2500, 400, false));

		System.out.println("l'affichage des proprietes");
		l.afficherProprietes();

		System.out.println("le nombre global des pièces :" + l.getnbPièces());

		ProprietePrivee propMinImpot = null;
		double minImpot = Double.MAX_VALUE;

		for (Propriété propriété : l.tabProp) {
			if (propriété instanceof ProprietePrivee) {
				ProprietePrivee propPrivee = (ProprietePrivee) propriété;
				double impot = propPrivee.calcullmpot();
				if (impot < minImpot) {
					minImpot = impot;
					propMinImpot = propPrivee;
				}
			}
		}

		if (propMinImpot != null) {
			System.out.println("Propriétaire payant le moins d'impôts : " + propMinImpot.responsable);
			System.out.println("Montant des impôts : " + minImpot);
		} else {
			System.out.println("Aucune propriété privée trouvée.");
		}
		
		for(int i=0;i<l.tabProp.length;i++)
		{
			if(l.tabProp[i] instanceof Appartment && ((Appartment) l.tabProp[i]).adresse.equals("Hammamet")) {
				l.supprimer(l.tabProp[i]);
				break;
			}
		}
		System.out.println("\nListe des propriétés après suppression : ");
        l.afficherProprietes();
        
        LotissementPrivee lt = new LotissementPrivee(10);
        lt.ajouter(new ProprietePrivee(1, p1, "Corniche", 350, 4));
        System.out.println("Nombre de pièces : " + lt.getnbPièces());
        lt.ajouter(new PropriétéProfessionnelle(4, p3, "Korba", 1000, 50, true));
        ProprietePrivee prop = lt.getpropriétéByIndice(0);
        if (prop != null) {
            System.out.println("Propriété récupérée : " + prop);
        }
	}

}
