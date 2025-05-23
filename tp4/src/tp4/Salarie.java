package tp4;

public class Salarie {
	protected int matricule;
	protected String nom;
	protected int recrutement;

	public Salarie(int matricule, String nom, int recrutement) {
		this.matricule = matricule;
		this.nom = nom;
		this.recrutement = recrutement;
	}

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getRecrutement() {
		return recrutement;
	}

	public void setRecrutement(int recrutement) {
		this.recrutement = recrutement;
	}

	@Override
	public String toString() {
		return "Salarie [matricule=" + matricule + ", nom=" + nom + ", recrutement=" + recrutement + "]";
	}

	public void affiche() {
		System.out.println(this);
	}
	
	public double Salaire() {
		double s;
		if(recrutement<2005)
		{s=400;}
		else
		{s=280;}
		return s;
	}

}
