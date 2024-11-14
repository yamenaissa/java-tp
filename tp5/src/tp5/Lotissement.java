package tp5;

public class Lotissement implements GestionPropriete {
	protected Propriété[] tabProp;
	protected int nombre;

	public Lotissement(int capacite) {
		if (capacite < GestionPropriete.MAX_PROPRIETES) {
			this.tabProp = new Propriété[capacite];
			this.nombre = 0;
		} else {
			System.out.println("the capacity is higher then Max!");
		}
	}

	public Propriété getpropriétéByIndice(int i) {
		if (i < nombre || i >= 0) {
			return tabProp[i];
		}
		return null;
	}

	public int getnbPièces() {
		int s = 0;
		for (int i = 0; i < nombre; i++) {
			if (tabProp[i] instanceof ProprietePrivee)
				s += ((ProprietePrivee)(tabProp[i])).getNbPieces();}	
	return s;}


	@Override
	public void afficherProprietes() {
		for (int i = 0; i < nombre; i++) {
			System.out.println(tabProp[i].toString());
			System.out.println("La valeur des impots a payer : "+tabProp[i].calcullmpot()+"\n");
		}
	}

	@Override
	public boolean ajouter(Propriété p) {
		if (nombre == GestionPropriete.MAX_PROPRIETES) {
			System.out.println("Le lotissement est plein.");
			return false;
		}
		tabProp[nombre] = p;
		nombre++;
		return true;
	}

	@Override
	public boolean supprimer(Propriété p) {
		for (int i = 0; i < nombre; i++) {
			if (tabProp[i].equals(p)) {
				for (int j = i; j < nombre - 1; j++) {
					tabProp[j] = tabProp[j + 1];
				}
				nombre--;
				return true;
			}
		}
		return false;
	}

}
