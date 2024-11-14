package tp4_3;

import java.util.Objects;

public abstract class Ustensile {
	protected int annee;

	public Ustensile(int annee) {
		this.annee = annee;
	}

	@Override
	public String toString() {
		return "Ustensile [annee=" + annee + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ustensile other = (Ustensile) obj;
		return annee == other.annee;
	}

	public abstract double valeur();
}
