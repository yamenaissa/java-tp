package e2;

public class ResultatOral implements Resultat {
	private String appreciation;

	public ResultatOral(String appreciation) {
		this.appreciation = appreciation;
	}

	@Override
	public String toString() {
		return "Note orale : " + appreciation;
	}

	@Override
	public int compareTo(Resultat r) {
		if (!(r instanceof ResultatOral)) {
			throw new IllegalArgumentException("Cannot compare different result types");
		}
		ResultatOral other = (ResultatOral) r;
		return Character.compare(this.appreciation.charAt(0), other.appreciation.charAt(0));
	}

}
