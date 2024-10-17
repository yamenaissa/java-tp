package tp4;

public class Employe extends Salarie {
	private double Hsupp;
	private double PHsupp;

	public Employe(int matricule, String nom, int recrutement, double hsupp, double pHsupp) {
		super(matricule, nom, recrutement);
		Hsupp = hsupp;
		PHsupp = pHsupp;
	}

	public double getHsupp() {
		return Hsupp;
	}

	public void setHsupp(double hsupp) {
		Hsupp = hsupp;
	}

	public double getPHsupp() {
		return PHsupp;
	}

	public void setPHsupp(double pHsupp) {
		PHsupp = pHsupp;
	}

	public void affiche() {
		System.out.println(super.toString());
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Employe [Hsupp=" + Hsupp + ", PHsupp=" + PHsupp + "]";
	}

	public double Salaire() {
		double s;
		s = super.Salaire();
		return ((Hsupp * PHsupp) + s);
	}

}
