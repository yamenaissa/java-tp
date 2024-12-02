package examenTP;

public class Test {
	public static void main(String[] args) {
		Agence A1 = new Agence("ref1", 100);
		Voiture V1 = new Voiture("FORD", "Fiesta", 2023, 11.000);
		Voiture V2 = new Voiture("KIA", "Rio", 2022, 28.500);
		Voiture V3 = new Voiture("KIA", "Picanto", 2019, 26.000);
		Voiture V4 = new Voiture("OPEL", "Astra", 2013, 45.000);

		try {
			A1.ajoutVoiture(V1);
			A1.ajoutVoiture(V2);
			A1.ajoutVoiture(V3);
			A1.ajoutVoiture(V4);
		} catch (AjoutInterditException e) {
			e.printStackTrace();
		}

		CriterePrix c = new CriterePrix(30.900);
		System.out.println("Les voitures qui satisfont le critere de prix");
		A1.selectionne(c);
	}
}
