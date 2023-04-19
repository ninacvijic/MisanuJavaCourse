package cvija;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Zad_7 {

	// Programski kreirati fajl i upisati tekst: Ja sam programer!

	public static void main(String[] args) throws IOException {

		DataInputStream dis = new DataInputStream(System.in);

		FileOutputStream fos = new FileOutputStream("unos.txt");

		System.out.println("Unesite tekst. Za prekid unosa pritisnite $");

		char ch;

		while ((ch = (char) dis.read()) != '$') {
			fos.write(ch);
		}

		fos.close();
	}

}
