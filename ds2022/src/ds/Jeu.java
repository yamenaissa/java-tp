package ds;

public class Jeu {
	private static int count=0;
	protected int id;
	protected String nom;
	protected int annee;
	protected int agem;
	protected Editeur e;
	protected static int nbjt;
	
	public Jeu(Editeur ed)
	{
		count ++;
		id=count;
		e=ed;
		nbjt++;
	}
	
	public Jeu(String nom,int annee,int agemin,Editeur edit)
	{
		this(edit);
		this.nom=nom;
		this.annee=annee;
		this.agem=agemin;
	}
	
	public Editeur getEditeur()
	{
		return e;
	}
	
	public void decrir()
	{
		System.out.println("Jeu [id=" + id + ", nom=" + nom + ", annee=" + annee + ", agem=" + agem + ", e=" + e + "]");
	}

}
