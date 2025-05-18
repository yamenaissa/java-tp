package ex2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Authentifcation {
	public static void main(String[] args) {
		String loginSaisi, mdpSaisi;
		boolean authentifie = false;
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Entrez votre login : ");
			loginSaisi = scanner.nextLine();

			System.out.print("Entrez votre mot de passe : ");
			mdpSaisi = scanner.nextLine();

			BufferedReader in = new BufferedReader(new FileReader("D:\\in.txt"));

			String ligne;
			while ((ligne = in.readLine()) != null) {
				String[] credentials = ligne.split(" ");
				if (credentials.length == 2) {
					String login = credentials[0];
					String mdp = credentials[1];

					if (login.equals(loginSaisi) && mdp.equals(mdpSaisi)) {
						authentifie = true;
						break;
					}
				}
			}

			in.close();
			scanner.close();

			if (authentifie) {
				System.out.println("Authentification réussi");
			} else {
				System.out.println("PB Authentification");
			}

		} catch (IOException e) {
			System.out.println("Erreur lors de la lecture du fichier : " + e.getMessage());
		}
	}
}