package tp1;

public class Test {
	public static void main(String[] args) {
		Point<Integer> p1 = new Point<>(5, 10, 'A');
		Point<Double> p2 = new Point<>(5.2, 10.45, 'B');

		PointColoréNG pcng1 = new PointColoréNG(6, 1, 'C', "red");

		PointColoré<Integer, String> pc1 = new PointColoré<>(12, 8, 'D', "blue");

		CouleurRVB couleurPc2 = new CouleurRVB(255, 165, 0);
		PointColoré<Double, CouleurRVB> pc2 = new PointColoré<>(4.5, 9.2, 'E', couleurPc2);

		Cercle<Integer> c1 = new Cercle<>(50, p1);

		CercleAvecRestriction<PointColoré> car1 = new CercleAvecRestriction<>(50, pc1);
		
		CercleAvecRestriction<PointColoré> car2 = new CercleAvecRestriction<>(50, pc2);
		
		System.out.println("Point générique(entier): " + p1);
		System.out.println("Point générique(double): " + p2);
		System.out.println("Point coloré non générique: " + pcng1);
		System.out.println("Point coloré générique: " + pc1);
		System.out.println("Point coloré générique: " + pc2);
		System.out.println("Cercle c1 : " + c1);
		System.out.println("Cercle car1 : " + car1);
		System.out.println("Cercle car2 : " + car2);
	}
}
