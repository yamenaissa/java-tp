package tp3_1;

public class AgenceMobiliere {
	private Vehicule tab[];
	private int max;
	private int nb = 0;

	public AgenceMobiliere(int max) {
		this.max = max;
		this.tab = new Vehicule[max];
		this.nb = 0;
	}

	public void ajoutVehicule(Vehicule v) {
		if (nb < max) {
			tab[nb] = v;
			nb++;
		} else {
			System.out.println("the table's dimension is insufficient");
		}
	}

	void affichtab() {
		int i;
		System.out.println("the table after adding a new vehicul : ");
		for (i = 0; i < nb; i++) {
			tab[i].decrisVehicule();
		}
	}

	public void selection(int n) {
		if (n > 0 && n <= nb) {
			tab[n - 1].decrisVehicule();
		} else {
			System.out.println("Either the column do not exist or it's still empty");
		}
	}

	public void selection(String mq) {
		System.out.println("Vehiculs having la marque " + mq + " :");
		int nmq = 0;
		for (int i = 0; i < nb; i++) {
			if (tab[i].getMarque().equals(mq)) {
				tab[i].decrisVehicule();
			} else {
				nmq++;
			}
		}
		if (nmq == nb) {
			System.out.println("0");
		}
	}

	public void selection(Double px) {
		System.out.println("Vehiculs having lesser than " + px + ":");
		int i = 0;
		int nmq = 0;
		for (i = 0; i < nb; i++) {
			if (tab[i].getPrix() < px) {
				tab[i].decrisVehicule();
			} else {
				nmq++;
			}
		}
		if (nmq == nb) {
			System.out.println("0");
		}
	}
	
	public void ancienne()
	{
		int min=tab[0].getAnnee();
		Vehicule ta=tab[0];
		for(int i=1; i<nb; i++)
		{
			if(min>tab[i].getAnnee())
			{
				min=tab[i].getAnnee();
				ta=tab[i];
			}
		}
		System.out.println("the oldest car considering the parking period is :");
		System.out.println(ta);
	}
}