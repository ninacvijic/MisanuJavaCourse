package cvija;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {  

	public static void main(String[] args) throws IOException { // kao i u proslom primeru
		
		FileInputStream fis = new FileInputStream("ispis.txt"); // import gore
		
		// ispis.txt pravim u Notepadu u folderu na Desktopu B_Output u ws2
		// i zapamtim ga Save As. Obavezno .txt !!!
		
		System.out.println("Sadrzaj fajla: ");
		
		// read() cita jedan po jedan bajt iz datoteke i vraca ga kao celobrojnu vrednost.
		// Kada stigne do kraja metoda read() vraca vrednost -1.
		
		// malo pre smo ucitavali znak po znak a sad bajt po bajt
		// malopre sa konzole a sada ne, sada pisem u fajlu ispis u folderu(Notepad)
		
		int ch;
		
		while((ch = fis.read()) != -1) {
			System.out.print((char)ch);
		}
		
		fis.close();
	}

}
// sad udjem u folder B_Output na racunaru i u fajl ispis.txt pisem(Notepad, mogu staro samo markirati i izbrisati i novo kucati)
// i idem na Save i onda udjem u eclipse i idem na Run i ispise mi se sve sto sam napisala tamo sad u Consoli
// Opet neka greska???? nemam prekida sa -1, ispise mi i -1 cak ???? 

