package tp3_2;

public class TestCompte {
	public static void main(String[] args) {
		Compte[] tc = new Compte[4];
		tc[0] = new Compte(new Personne("Aissa", "Yamen", "Adresse"), 1000, 500);
		tc[1] = new Compte(new Personne("Ayari", "Ahmed", "Adresse"), 1000, 500);
		tc[2] = new Compte(new Personne("sss", "aaa", "Adresse"), 1000, 500);
		tc[3] = new Compte(new Personne("lll", "bbb", "Adresse"), 1000, 500);
		for (int i = 0; i < 4; i++) {
			tc[i].afficher();
		}
		tc[0].setSolde(2000);
		tc[1].setSolde(500);
		tc[0].Virement(100, tc[1]);
		System.out.println("the two accounts after the withdrawal:");
		tc[0].afficher();
		tc[1].afficher();
	}
}
