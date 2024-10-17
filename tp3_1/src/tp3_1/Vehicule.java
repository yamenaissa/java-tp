package tp3_1;
public class Vehicule
{
	private int norder;
	private String marque;
	private String modele;
	private int annee;
	private double prix;
	private static int count=0;
	public Vehicule(String marque, String modele, int annee, double prix)
	{
		this.norder = ++count;
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.prix = prix;
	}
	

	@Override
	public String toString() {
		return "Vehicule [norder=" + norder + ", marque=" + marque + ", modele=" + modele + ", annee=" + annee
				+ ", prix=" + prix + "]";
	}
	
	public void decrisVehicule()
	{
		System.out.println(this);
	}
	public String getMarque() {return marque;}

    public void setMarque(String marque) {this.marque = marque;}

    public String getModele() {return modele;}

    public void setModele(String modele) {this.modele = modele;}

    public double getPrix() {return prix;}

    public void setPrix(double prix) {this.prix = prix;}

    public int getAnnee() {return annee;}

    public static int getCount() {return count;}
}