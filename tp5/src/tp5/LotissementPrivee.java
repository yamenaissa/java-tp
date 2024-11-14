package tp5;

public class LotissementPrivee extends Lotissement {

	public LotissementPrivee(int capacite) {
		super(capacite);
	}

	public boolean ajouter(Propriété p) {
		if (!(p instanceof ProprietePrivee)) {
			System.out.println("Seules les propriétés privées sont autorisées dans ce lotissement.");
			return false;
		}
		return super.ajouter(p);
	}

	public ProprietePrivee getpropriétéByIndice(int i) {
		Propriété p = super.getpropriétéByIndice(i);
		if (p instanceof ProprietePrivee) {
			return (ProprietePrivee) p;
		} else {
			return null;
		}
	}

	@Override
	public int getnbPièces() {
		return nombre;
	}
}
