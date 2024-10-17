package tp3_2;

public class Personne {
	private String nom;
	private String prénom;
	private String adresse;

	public Personne(String nom, String prénom, String adresse) {
		this.nom = nom;
		this.prénom = prénom;
		this.adresse = adresse;
	}
	
	@Override
	public String toString() {
		return "{" + "nom='" + nom + '\'' + ", prénom='" + prénom + '\'' + ", adresse='" + adresse + '\'' + '}';
	}
}