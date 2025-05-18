package ex3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		int nombreLignes = 0;
		int nombreMots = 0;
		int nombreCaracteres = 0;

		try (BufferedReader lecteur = new BufferedReader(new FileReader("D:\\in.txt"))) {
			String ligne;

			while ((ligne = lecteur.readLine()) != null) {
				nombreLignes++;
				nombreCaracteres += ligne.length();
				StringTokenizer tokenizer = new StringTokenizer(ligne);
				int motsLigne = tokenizer.countTokens();
				nombreMots += motsLigne;
			}
			System.out.println("Nombre de lignes: " + nombreLignes);
			System.out.println("Nombre de mots: " + nombreMots);
			System.out.println("Nombre de caractères: " + nombreCaracteres);
		} catch (IOException e) {
			System.err.println("Erreur lors de la lecture du fichier: " + e.getMessage());
		}
	}
}