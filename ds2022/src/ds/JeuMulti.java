package ds;

public class JeuMulti extends Jeu{
	private int NombreJoueur;
	public JeuMulti(String nom,int annee, int age,Editeur e,int nbj)
	{
		super(nom,annee,age,e);
		NombreJoueur=nbj;
	}
	
	
	
	public int getNombreJoueur() {
		return NombreJoueur;
	}



	public void setNombreJoueur(int nombreJoueur) {
		NombreJoueur = nombreJoueur;
	}



	public void decrir()
	{
		super.decrir();
		System.out.println("Nombre de joueur : "+NombreJoueur);
	}
	
}
