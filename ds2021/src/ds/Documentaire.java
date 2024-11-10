package ds;

import java.util.Scanner;

public class Documentaire extends Film{
	private String sujet;
	private float tarif=2;
	
	public Documentaire(String s,String titre,String r,int duree, String p)
	{
		super(titre,r,p,duree);
		sujet=s;
	}
	
	public String toString()
	{
		return super.toString()+" le sujet :"+sujet;
	}
	
	 @Override
	    public float totalVenteBillets() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nombre de billets vendus : ");
	        int nbBilletsVendus = scanner.nextInt();

	        return nbBilletsVendus * tarif;
	    }
	 
	 
}
