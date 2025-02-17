package tp1;

public class Point<t> {
	protected t abs;
	protected t ord;
	protected char nom;

	public Point(t abs, t ord, char nom) {
		super();
		this.abs = abs;
		this.ord = ord;
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Point "+ nom +" [abs=" + abs + ", ord=" + ord +",";
	}

	public t getAbs() {
		return abs;
	}

	public void setAbs(t abs) {
		this.abs = abs;
	}

	public t getOrd() {
		return ord;
	}

	public void setOrd(t ord) {
		this.ord = ord;
	}

	public char getNom() {
		return nom;
	}

	public void setNom(char nom) {
		this.nom = nom;
	}

}
