package imageCopying;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Image {
	public static void main(String[] args) throws IOException {
		File inputFile = new File("D:\\Capture.PNG"); 
		File outputFile = new File("D:\\sadHamster.PNG"); 
		
		FileInputStream in = new FileInputStream(inputFile);
		FileOutputStream out = new FileOutputStream(outputFile);

		BufferedInputStream buffIn = new BufferedInputStream(in);
		BufferedOutputStream buffOut = new BufferedOutputStream(out);

		byte[] buffer = new byte[4096];
		int bytesRead;

		while ((bytesRead = buffIn.read(buffer)) != -1) {
			buffOut.write(buffer, 0, bytesRead);
		}

		buffIn.close();
		buffOut.close();
		in.close();
		out.close();

		System.out.println("Copie de l'image terminée avec succès.");
	}
}
