package tp5_1;

import java.io.File;
import java.io.FilenameFilter;

public class Filtre implements FilenameFilter {
	private char lettre;

	public Filtre(char lettreDébut) {
		lettre = lettreDébut;
	}

	@Override
	public boolean accept(File dir, String name) {
		if(name.toLowerCase().charAt(0)==Character.toLowerCase(lettre) && dir.isDirectory())
			return true;
		return false;
	}
}