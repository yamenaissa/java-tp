package tp3_2;

public class Compte {
	private int ncompte;
	private Personne titulaire;
	private double solde;
	private double decouvertMax;
	private double debitMax;
	private boolean estadecouvert = false;
	static public int count;

	public Compte(Personne titulaire) {
		this.ncompte = ++count;
		this.titulaire = titulaire;
		decouvertMax = 800;
		debitMax = 1000;
	}

	public Compte(Personne titulaire, double découvertMax, double débitMax) {
		// hethi bech n3aytou ll constructeur eli 9ablou.
		this(titulaire);
		this.decouvertMax = découvertMax;
		this.debitMax = débitMax;
	}

	public void afficher() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Compte [ncompte=" + ncompte + " Personne=" + titulaire + ", solde=" + solde + ", decouvertMax="
				+ decouvertMax + ", debitMax=" + debitMax + "]";
	}

	public int getNcompte() {
		return ncompte;
	}

	public void setNcompte(int ncompte) {
		this.ncompte = ncompte;
	}

	public Personne getTitulaire() {
		return titulaire;
	}

	public void setTitulaire(Personne titulaire) {
		this.titulaire = titulaire;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public double getDecouvertMax() {
		return decouvertMax;
	}

	public void setDecouvertMax(double decouvertMax) {
		this.decouvertMax = decouvertMax;
	}

	public double getDebitMax() {
		return debitMax;
	}

	public void setDebitMax(double debitMax) {
		this.debitMax = debitMax;
	}

	public boolean isEstadecouvert() {
		return estadecouvert;
	}

	public void setEstadecouvert(boolean estadecouvert) {
		this.estadecouvert = estadecouvert;
	}

	public void créditer(double somme) {
		if (somme > 0) {
			solde += somme;
		} else {
			System.out.println("'la somme' is either null or negative ");
		}
	}

	public boolean débiter(double somme) {
		if (somme > 0 && somme <= debitMax && solde - somme >= decouvertMax) {
			solde -= somme;
			return true;
		} else {
			return false;
		}
	}

	public boolean estadecouvert() {
		return solde < 0;
	}

	public double MontantDécouvert() {
		return solde;
	}

	public void Virement(double montant, Compte c) {
		if (this.débiter(montant))
			c.créditer(montant);
	}

	public static void Virement(double montant, Compte c1, Compte c2) {
		if (c1.débiter(montant)) {
			c2.créditer(montant);
			
		}
	}
}
