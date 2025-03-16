package Exercice;

public class Test {
	public static void main(String[] args) {
		Employé e1 = new Employé(11223344, "Alice Dupont", 4000.0, 1);
		Employé e2 = new Employé(22334455, "Bob Martin", 3500.0, 1);
		Employé e3 = new Employé(33445566, "Charlie Durand", 2800.0, 2);
		Employé e4 = new Employé(44556677, "Sally", 2000.0, 2);
		Employé e5 = new Employé(55667788, "Noah beck", 1500.0, 2);
		Employé e6 = new Employé(66778899, "James Aurther", 2900.0, 2);
		Employé e7 = new Employé(77889900, "Adele", 3000.0, 2);
		Employé e8 = new Employé(88990011, "Sabrina", 3400.0, 2);
		Employé e9 = new Employé(99001122, "Om kolthoum", 2900.0, 2);
		Departement dep1 = new Departement(1);
		Departement dep2 = new Departement(2);
		Departement dep3 = new Departement(3);

		dep1.ajoutEmploye(e1);
		dep1.ajoutEmploye(e2);
		dep2.ajoutEmploye(e3);
		dep2.ajoutEmploye(e4);
		dep3.ajoutEmploye(e5);
		dep3.ajoutEmploye(e6);
		dep3.ajoutEmploye(e7);
		dep3.ajoutEmploye(e8);
		dep2.ajoutEmploye(e9);

		System.out.println("Département 1:");
		dep1.afficheDep();

		System.out.println("\nDépartement 2:");
		dep2.afficheDep();

		System.out.println("\nDépartement 3:");
		dep3.afficheDep();

		System.out.println(dep1.existeE(12345678));
		System.out.println("L'employe a le plus haut salaire :" + dep3.getEmpMax());

		Entreprise E1 = new Entreprise("hello");
		E1.ajoutDep(dep1);
		E1.ajoutDep(dep2);
		E1.ajoutDep(dep3);

		E1.afficheE();
		E1.UpdateDep(e3, 1);
		System.out.println("le departement de id 1 apres le changement:");
		dep1.afficheDep();

		E1.existeD(dep2);
		E1.DepMinCapacity();
	}
}