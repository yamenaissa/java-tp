package examenTP;

public class Voiture {
	private String marque;
	private String modèle;
	private int année;
	private double prixLocation;

	public Voiture(String marque, String modèle, int année, double prixLocation) {
		this.marque = marque;
		this.modèle = modèle;
		this.année = année;
		this.prixLocation = prixLocation;
	}

	public String getMarque() {
		return marque;
	}

	public String getModèle() {
		return modèle;
	}

	public int getAnnée() {
		return année;
	}

	public double getPrixLocation() {
		return prixLocation;
	}

	@Override
	public String toString() {
		return "Voiture [marque=" + marque + ", modèle=" + modèle + ", année=" + année + ", prixLocation="
				+ prixLocation + "]";
	}

}
