package Exercice2;

public class TestPile {
	public static void main(String[] args) {
		PileListe<Integer> p = new PileListe<>();
		for (int i = 0; i < 10; i++) {
			p.empiler(i);
		}

		while (!p.estVide()) {
			System.out.println(p.dernier());
			p.depiler();
		}

		PileListe<String> pileDeChaines = new PileListe<>();
		pileDeChaines.empiler("Bonjour");
		pileDeChaines.empiler("le");
		pileDeChaines.empiler("monde");

		while (!pileDeChaines.estVide()) {
			System.out.println(pileDeChaines.dernier());
			pileDeChaines.depiler();
		}
	}
}