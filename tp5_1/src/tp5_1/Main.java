package tp5_1;

import java.io.*;
import static java.lang.System.*;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("Répertoire courant : " + System.getProperty("user.dir"));
		File rep = new File(".");
		System.out.println("Chemin relatif : " + rep.getPath());
		System.out.println("Chemin absolu : " + rep.getAbsolutePath());

		for (File élément : rep.listRoots())
			out.println("Racine : " + élément);

		for (File élément : rep.listFiles()) {
			if (élément.isDirectory()) {
				System.out.print(élément.getName() + "\t");
				if (élément.getName().length() < 8)
					System.out.print("\t");
				System.out.println("<REP>");
			}
		}

		for (File élément : rep.listFiles()) {
			if (élément.isFile()) {
				out.print(élément.getName() + "\t");
				if (élément.getName().length() < 8)
					out.print("\t");
				System.out.printf("%tc", new Date(élément.lastModified()));
				System.out.printf("\t%10d octets\n", élément.length());
			}
		}

		out.println("\nRépertoires commençant par 'b':");
		FilenameFilter filtre = new Filtre('b');
		File[] repB = rep.listFiles(filtre);
		for (File dossier : repB) {
			out.println(dossier.getName());
		}
	}
}