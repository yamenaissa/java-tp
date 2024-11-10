package ds;

import java.util.Scanner;

public class Film {
	protected String titre;
	protected String realisateur;
	protected String pays;
	protected int duree;
	protected int nbr;
	
	public Film(String titre, String r,String pays,int d)
	{
		this.titre=titre;
		realisateur=r;
		this.pays=pays;
		duree=d;
	}

	public int getNbr() {
		return nbr;
	}

	public void setNbr(int nbr) {
		this.nbr = nbr;
	}
	
	public String toString()
	{
		return titre+" de "+realisateur+" ( "+pays+" ) -"+duree+" min";
	}
	
	 public float totalVenteBillets() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nombre de places pour étudiants : ");
	        int nbPlacesEtudiants = scanner.nextInt();

	        if (nbPlacesEtudiants > nbr) {
	            System.out.println("Nombre de places pour étudiants ne peut pas dépasser le nombre de places réservées.");
	            return 0;
	        }

	        float total = nbPlacesEtudiants * 2 + (nbr - nbPlacesEtudiants) * 3;
	        return total;
	    }
}
