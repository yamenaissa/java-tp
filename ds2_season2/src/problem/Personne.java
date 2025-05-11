package problem;

import java.util.ArrayList;
import java.util.Objects;

public class Personne {
	private String nomPrenom;
	private String pseudo;

	public Personne(String nomPrenom, String pseudo) {
		this.nomPrenom = nomPrenom;
		this.pseudo = pseudo;
	}

	public String getNomPrenom() {
		return nomPrenom;
	}

	public void setNomPrenom(String nomPrenom) {
		this.nomPrenom = nomPrenom;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String toString() {
		return "personne [nomPrenom=" + nomPrenom + ", pseudo=" + pseudo +

				"]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nomPrenom, pseudo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		return Objects.equals(nomPrenom, other.nomPrenom) && Objects.equals(pseudo, other.pseudo);
	}

}