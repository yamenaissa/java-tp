package examenTP;

public class CriterePrix implements Critere {
	private double prix;

	public CriterePrix(double prix) {
		this.prix = prix;
	}

	@Override
	public boolean correspond(Object o) {
		Voiture v = (Voiture) o;
		if (v.getPrixLocation() < prix) {
			return true;
		}
		return false;
	}

}
