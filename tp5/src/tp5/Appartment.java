package tp5;

public class Appartment extends ProprietePrivee{
	private int numEtage;
	
	public Appartment(int id, Personne responsable, String adresse, double surface, int nbPieces, int numEtage) {
		super(id, responsable, adresse, surface, nbPieces);
		this.setNumEtage(numEtage);
	}

	public int getNumEtage() {
		return numEtage;
	}

	public void setNumEtage(int numEtage) {
		this.numEtage = numEtage;
	}
	
	
}
