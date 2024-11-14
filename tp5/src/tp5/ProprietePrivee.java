package tp5;

public class ProprietePrivee extends Propriété{
	protected int nbPieces;

	public ProprietePrivee(int id, Personne responsable, String adresse, double surface, int nbPieces) {
		super(id, responsable, adresse, surface);
		this.nbPieces = nbPieces;
	}

	@Override
	public String toString() {
		return super.toString()+" ProprietePrivee [nbPieces=" + nbPieces + "]";
	}
	
	public int getNbPieces() {
		return nbPieces;
	}

	public void setNbPieces(int nbPieces) {
		this.nbPieces = nbPieces;
	}

	@Override
	public double calcullmpot()
	{
		double impot = (super.surface/100)*50+(nbPieces*10);
		return impot;
	}

}
