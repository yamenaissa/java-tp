package tp5;

public abstract class Propriété {
	protected int id;
	protected Personne responsable;
	protected String adresse;
	protected double surface;
	public Propriété(int id, Personne responsable, String adresse, double surface) {
		this.id = id;
		this.responsable = responsable;
		this.adresse = adresse;
		this.surface = surface;
	}
	
	@Override
	public String toString() {
		return "Propriete [id=" + id + ", responsable=" + responsable + ", adresse=" + adresse + ", surface=" + surface;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Propriété other = (Propriété) obj;
		return id == other.id;
	}

	public abstract double calcullmpot();
}
