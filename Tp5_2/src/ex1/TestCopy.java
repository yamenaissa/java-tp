package ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestCopy {
	public static void main(String[] args) throws IOException {
		File inputFile = new File("D:\\in.txt");
		File outputFile = new File("D:\\out.txt");

		BufferedReader in = new BufferedReader(new FileReader(inputFile));
		BufferedWriter out = new BufferedWriter(new FileWriter(outputFile));

		String ligne;
		while ((ligne = in.readLine()) != null) {
			out.write(ligne);
			out.newLine();
		}
		in.close();
		out.close();

		System.out.println("Copie terminée avec succès .");
	}
}
