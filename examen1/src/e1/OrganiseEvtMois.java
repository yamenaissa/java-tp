package e1;

public class OrganiseEvtMois {
	private int mois;
	private ThemeEvt theme;
	private Evenement[] tab;

	public int nbMax() {
		switch (mois) {
		case 2:
			return 28;
		case 4:
			return 30;
		case 6:
			return 30;
		case 9:
			return 30;
		case 11:
			return 30;
		default:
			return 31;
		}
	}

	public OrganiseEvtMois(int mois, ThemeEvt theme) {
		this.mois = mois;
		this.theme = theme;
		this.tab = new Evenement[nbMax()];
	}

	public void ajouter(Evenement Evt, int jour) throws EvtException {
		if (jour < 1 || jour > nbMax()) {
			throw new EvtException("Jour Incorrecte");
		}
		if (tab[jour - 1] != null) {
			for (int i = 0; i < nbMax(); i++) {
				if (tab[i] == null) {
					tab[i] = Evt;
					return;
				}
			}
			throw new EvtException("Complet");
		}
		tab[jour - 1] = Evt;
	}

	public void afficherCalendrierEvts() {
		for (int i = 0; i < nbMax(); i++) {
			System.out.println("jour " + (i + 1));
			if (tab[i] != null) {
				System.out.println(tab[i].toString());
			} else {
				System.out.println("pas d'evenement");
			}
		}
	}

}
