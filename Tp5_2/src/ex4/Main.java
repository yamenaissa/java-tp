package ex4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void cryptage(String cheminSource, String cheminDestination) {
		try (BufferedReader lecteur = new BufferedReader(new FileReader(cheminSource));
				BufferedWriter ecrivain = new BufferedWriter(new FileWriter(cheminDestination))) {

			int caractere;
			while ((caractere = lecteur.read()) != -1) {
				char caractereCrypte = (char) (caractere + 1);
				ecrivain.write(caractereCrypte);
			}
			System.out.println("Le fichier a été crypté avec succès!");
		} catch (IOException e) {
			System.err.println("Erreur lors du cryptage du fichier: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		cryptage("D:\\in.txt", "D:\\Users_crypte.txt");
	}
}