package e2;

public class ResultatPoints implements Resultat {
	private int points;

	public ResultatPoints(int points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "Points: " + points;
	}

	@Override
	public int compareTo(Resultat r) {
		if (!(r instanceof ResultatPoints)) {
			throw new IllegalArgumentException("Résultats de types différents");
		}
		ResultatPoints other = (ResultatPoints) r;
		return Integer.compare(this.points, other.points);
	}
}
