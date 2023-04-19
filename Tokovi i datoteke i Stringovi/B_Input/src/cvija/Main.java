package cvija;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {  

	public static void main(String[] args) throws IOException {  // bice prijava izuzetaka u Consoli ako ovo ne upisemo
		                                                         // ici na import gore  // mora biti IO
		// Osnovne IO/UI operacije (input output / ulazno izlazne)
		// Za UI operacije Java koristi tokove, odnosno Stream-ove.
		// Strimovi obezbedjuju nacin za rad sa podacima, koji se primaju i salju.
		
		// Klasa koja omogucuje da se poveze tastatura sa stream-om
		DataInputStream dis = new DataInputStream(System.in); // gore import // omogucava nam unos podataka sa konzole
		
		// Povezivanje fajla sa klasom FileOutputStream
		FileOutputStream fos = new FileOutputStream("rezultat.txt"); //zbog ovoga gore throws Exception  // gore import
		                
		// u folderu ws2, udjem u folder B_input i tu u Notepadu napravim dokument rezultat, i to .txt, i zapamtim ga 
		// pomocu Save As u taj folder  // prije ovoga iznad!
		
		System.out.println("Unesite string(Unos prekinite unosom karaktera $): "); // najcesce se sa znakom dolar prekida unos
		// read()  // metode
		// write()
		
		char ch;
		while((ch = (char)dis.read()) != '$') { // konvertuje ??
			fos.write(ch);
		}
		fos.close(); // zatvoriti klasu da bismo oslobodili prostor za druge resurse u sistemu?
		
	}

}
// trebalo bi da sad kad udjem u folder B_Input i udjem u rezultat.txt u njemu bude sve sto sam pisala na Consoli

