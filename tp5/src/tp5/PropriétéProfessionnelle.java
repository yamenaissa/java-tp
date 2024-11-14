package tp5;

public class PropriétéProfessionnelle extends Propriété{
	private int nbEmployes;
	private boolean estEtatique;
	
	public PropriétéProfessionnelle(int id, Personne responsable, String adresse, double surface, int nbEmployes,
			boolean estEtatique) {
		super(id, responsable, adresse, surface);
		this.nbEmployes = nbEmployes;
		this.estEtatique = estEtatique;
	}
	
	@Override
	public String toString() {
		return " PropriétéProfessionnelle ["+super.toString()+ ", nbEmployes=" + nbEmployes + ", estEtatique=" + estEtatique + "]";
	}
	
	@Override
	public double calcullmpot() {
		if(estEtatique==true)
			return 0;
		else
			return(((super.surface/100)*50)+(30*nbEmployes));
	}
	
}
