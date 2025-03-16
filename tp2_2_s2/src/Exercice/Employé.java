package Exercice;

import java.util.Objects;

public class Employé implements Comparable<Employé> {
	protected int cin;
	protected String nom;
	protected double salaire;
	protected int idDepartement;

	public Employé(int cin, String nom, double salaire, int idDepartement) {
		this.cin = cin;
		this.nom = nom;
		this.salaire = salaire;
		this.idDepartement = idDepartement;
	}

	public int getCin() {
		return cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public int getIdDepartement() {
		return idDepartement;
	}

	public void setIdDepartement(int idDepartement) {
		this.idDepartement = idDepartement;
	}

	@Override
	public String toString() {
		return "Employé [cin=" + cin + ", nom=" + nom + ", salaire=" + salaire + ", idDepartement=" + idDepartement
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cin);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employé other = (Employé) obj;
		return cin == other.cin;
	}

	public int compareTo(Employé o) {
		return Double.compare(this.salaire, o.salaire);
	}

}
