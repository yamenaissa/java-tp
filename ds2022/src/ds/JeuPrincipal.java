package ds;

public class JeuPrincipal {
	public static void main(String[] args)
	{
		Editeur Ed1=new Editeur(123,"Ubisoft","Canada");
		Editeur Ed2=new Editeur(133,"Vivendi Universa","France");
		
		Jeu Tab[]=new Jeu[3];
		Tab[0]=new Jeu("Watch dogs",2020,6,Ed1);
		Tab[1]=new Jeu("WoW",2019,12,Ed2);
		Tab[2]=new JeuMulti("WoW",2018,12,Ed2,2);
		Tab[1].decrir();
		Tab[2].decrir();
		int s=0;
		for(int i=0;i<3;i++)
		{
			if(Tab[i] instanceof JeuMulti)
			{
				s+=((JeuMulti) Tab[i]).getNombreJoueur();
			}
		}
		System.out.println(s);
	}
}
