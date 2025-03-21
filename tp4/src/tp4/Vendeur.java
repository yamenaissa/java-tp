package tp4;

public class Vendeur extends Salarie {
	private double vente;
	private double pourcentage;

	public Vendeur(int matricule, String nom, int recrutement, double vente, double pourcentage) {
		super(matricule, nom, recrutement);
		this.vente = vente;
		this.pourcentage = pourcentage;
	}

	public double getVente() {
		return vente;
	}

	public void setVente(double vente) {
		this.vente = vente;
	}

	public double getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(double pourcentage) {
		this.pourcentage = pourcentage;
	}

	public void affiche() {
		System.out.println(super.toString());
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Vendeur [vente=" + vente + ", pourcentage=" + pourcentage + "]";
	}

	public double Salaire() {
		double s;
		s = super.Salaire();
		return ((vente * pourcentage) + s);
	}

}
