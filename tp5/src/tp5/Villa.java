package tp5;

public class Villa extends ProprietePrivee{
	
	private boolean avecPiscine;
	public Villa(int id, Personne responsable, String adresse, double surface, int nbPieces,boolean avecp) {
		super(id, responsable, adresse, surface, nbPieces);
		this.avecPiscine=avecp;
	}

	public double calcullmpot()
	{
		double impot = 0;
		if(avecPiscine==true)
			impot = (super.surface/100)*50+(nbPieces*10)+200;
		else
			impot = (super.surface/100)*50+(nbPieces*10);
		return impot;
	}
	
}
