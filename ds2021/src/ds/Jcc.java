package ds;

public class Jcc {
	private int annee;
	final private static int NBFMAX=30;
	private Film[] f1;
	private int nbf;
	public Jcc(int n,int annee)
	{
		f1=new Film[n];
		annee=annee;
		nbf=0;
	}
	
	public void ajoutFilm(Film f)
	{
		if(nbf < NBFMAX)
		{
			f1[nbf]=f;
			nbf++;
		}
		else {System.out.println("il y aune faute wooooooooh");}
	}
	
	public void listeFilmJcc()
	{
		for(int i=0;i<nbf;i++)
		{
			System.out.println(f1[i].toString());
		}
	}
	
	 public float totalVenteBilletsJcc() {
	        float total = 0;
	        for (int i = 0; i < nbf; i++) {
	            total += f1[i].totalVenteBillets();
	        }
	        return total;
	    }

	    public static void main(String[] args) {
	        Jcc jcc2021 = new Jcc(NBFMAX, 2021);

	        Film film1 = new Film("Le dernier refuge", "Ousman", "Mali", 86);
	        film1.setNbr(30);
	        Film film2 = new Film("Insurrection", "Jilani Saadi", "Tunisie", 105);
	        film2.setNbr(45);
	        jcc2021.ajoutFilm(film1);
	        jcc2021.ajoutFilm(film2);

	        jcc2021.listeFilmJcc();

	        float totalVentes = jcc2021.totalVenteBilletsJcc();
	        System.out.println("Montant total des ventes de billets pour les JCC 2021 : " + totalVentes);
	    }
}
