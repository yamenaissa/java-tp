package tp4;

public class Entreprise {
	public static void main(String[] args) {
		Salarie tabSalarie[] = new Salarie[5];
		tabSalarie[0] = new Employe(12345, "Walid", 2002, 15, 4);
		tabSalarie[1] = new Vendeur(23445, "Yessine", 2007, 1000, 0.1);
		tabSalarie[2] = new Vendeur(65478, "Nassime", 2000, 700, 0.1);
		tabSalarie[3] = new Employe(87698, "Aymen ", 2003, 19, 5);
		tabSalarie[4] = new Employe(12345, "Khaled", 2008, 7, 4);
		System.out.println("******************************** Liste des Employés*****************************");
		for (int i = 0; i < 5; i++) {
			if (tabSalarie[i] instanceof Employe)
				tabSalarie[i].affiche();
		}
		System.out.println("***************************************************************************** \n");
		System.out.println("******************************** Liste des Vendeurs*****************************");
		for (int i = 0; i < 5; i++) {
			if (tabSalarie[i] instanceof Vendeur)
				tabSalarie[i].affiche();
		}
		System.out.println("***************************************************************************** \n");
		System.out.println("******************* Nom du salarié le plus ancien dans l'entreprise ********************");
		int min = tabSalarie[0].recrutement;
		String n = tabSalarie[0].nom;
		for (int i = 1; i < 5; i++) {
			if (tabSalarie[i].recrutement < min) {
				min = tabSalarie[i].recrutement;
				n = tabSalarie[i].nom;
			}
		}
		System.out.println("Nom: " + n + " recruté en l’an " + min);
		System.out.println("***************************************************************************** \n");
		System.out.println("****************** Matricule du vendeur disposant du plus grand salaire ****************");
		/*
		 * double salair = 0;
		 * int mat = 0; 
		 * for (Salarie salarie : tabSalarie) { 
		 * 		if(salarie instanceof Vendeur) {
		 * 			if (salarie.Salaire() > salair)
		 * 				salair =salarie.Salaire(); mat = salarie.matricule;
		 * 		}
		 * 	}
		 * System.out.println("Matricule = " + mat + " de salaire = " + salair + " Dt");
		 * System.out.println("*****************************************************************************");
		 */
		Salarie maxv = null;
		for (Salarie e : tabSalarie) {
			if(e instanceof Vendeur) {
				if(maxv==null) {
					maxv=e;
				}
				else {
					if(e.Salaire()>maxv.Salaire())
						maxv=e;
				}
			}
		}
		System.out.println("Matricule = " + maxv.matricule + " de salaire = " + maxv.Salaire() + " Dt");
		System.out.println("*****************************************************************************");
	}
}
