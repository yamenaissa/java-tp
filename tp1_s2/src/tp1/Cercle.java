package tp1;

public class Cercle<t> {
	private int rayon;
	private Point<t> centre;

	public Cercle(int rayon, Point<t> centre) {
		this.rayon = rayon;
		this.centre = centre;
	}

	public int getRayon() {
		return rayon;
	}

	public void setRayon(int rayon) {
		this.rayon = rayon;
	}

	public Point<t> getCentre() {
		return centre;
	}

	public void setCentre(Point<t> centre) {
		this.centre = centre;
	}

	@Override
	public String toString() {
		return "Cercle [rayon=" + rayon + ", centre=" + centre.toString() + "]]";
	}

}
