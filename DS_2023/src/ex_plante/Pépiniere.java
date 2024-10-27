package ex_plante;

public class Pépiniere {
	final int Max_Plante = 1000;
	Plante inventaire[] = new Plante[Max_Plante];
	private int nombreDePlantes = 0;

	public Pépiniere() {
		Plante inventaire[] = new Plante[Max_Plante];
	}

	public void ajoutPlante(Plante plante) {
		if (nombreDePlantes < Max_Plante) {
			inventaire[nombreDePlantes] = plante;
			nombreDePlantes++;
		} else {
			System.out.println("la taille de tableau est maximale");
		}
	}

	public void afficherInventaire() {
		for (int i = 0; i < nombreDePlantes; i++) {
			System.out.println("Plante #"+i);
			inventaire[i].description();
			if (inventaire[i] instanceof Fleure) {
				((Fleure) inventaire[i]).fleurir();
			}
			System.out.println("\n");
		}
	}
	
	public double totalAbsorptionTotaleCO2()
	{
		double s1=0;
		for (int i = 0; i < nombreDePlantes; i++) {
			if (inventaire[i] instanceof Arbre) {
				s1+=((Arbre) inventaire[i]).absorptionCO2();
			}
		}return s1;
	}
	
	public int compterArbresCaduques()
	{
		int s2=0;
		for (int i = 0; i < nombreDePlantes; i++) {
			if (inventaire[i] instanceof Arbre) {
				if((((Arbre) inventaire[i]).type_Feuillage).equalsIgnoreCase("Caduque"))
				{s2++;}
			}
		}return s2;
	}
}
