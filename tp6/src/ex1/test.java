package ex1;

/*
 * premier cas:
public class test {
	public static void main(String[] args) {
	try {
		double n=Double.parseDouble(args[0]);
		double x=Double.parseDouble(args[1]);
		System.out.println(Mathematique.f(n, x));
	}
	catch(ArrayIndexOutOfBoundsException A) {
		System.out.println("Vous devriez entrer deux nombres sur la ligne de commande pour que ça fonctionne ");
	}
	System.out.println("suivi de cours");
	}
}*/
public class test {
	public static void main(String[] args) {
		try {
			double n = Double.parseDouble(args[0]);
			double x = Double.parseDouble(args[1]);
			if (n == 0) {
				throw new ArithmeticException("impossible de faire une division par zéro !");
			}
			if (x < 0 || n < 0) {
				throw new negativ();
			}
			System.out.println(Mathematique.f(n, x));
		} catch (ArrayIndexOutOfBoundsException A) {
			System.out.println("Vous devriez entrer deux nombres sur la ligne de commande pour que ça fonctionne ");
		} catch (NumberFormatException N) {
			System.out.println("Les arguments doivent être des nombres " + N.getMessage());
		} catch (ArithmeticException A) {
			System.out.println("N doit etre non null, " + A.getMessage());
		} catch (negativ N) {
			System.out.println("on ne peut pas calculer une racine pour un réel negatif !!!!!");
		}
		System.out.println("suivi de cours");
	}
}
