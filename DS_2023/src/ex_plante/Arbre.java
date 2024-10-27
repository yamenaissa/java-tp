package ex_plante;

public class Arbre extends Plante{
	protected String type_Feuillage;
	final double AbsorMoyenne=22;
	
	public Arbre(String nom, int hauteur, int age, double prix, String tf)
	{
		super(nom, hauteur, age, prix);
		type_Feuillage=tf;
	}
	
	public void description() {
		System.out.println(super.toString());
		System.out.println(this);
	}
	
	public String toString()
	{
		return "type Feuillage: "+type_Feuillage+", AbsorMoyenne: "+AbsorMoyenne;
	}
	
	public double absorptionCO2()
	{
		if(hauteur>50)
		{return AbsorMoyenne+3;}
		else {return AbsorMoyenne;}
	}
}
