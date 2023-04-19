package cvija;

public class Main {

	public static void main(String[] args) {

		int d, a;
		
		try {             // U try bloku se stavljaju naredbe koje mogu baciti izuzetak,
				          // kao i one naredbe koje se nece izvrsiti ako dodje do izuzetka.
			d = 0;   // staviti npr da je d = 1, pa videti sta ce tada biti odstampano u Consoli
			a = 10 / d;   // rizicna operacija  // ovde je program pukao
			System.out.println("Ova poruka nece biti odstampana! ");   // jer je doslo do prekida programa zbog izuzetka
		} catch (ArithmeticException e) {      // hvatamo izuzetak  // e je objekat  // ne dolazi do zaustavljanja rada programa kad imamo catch-samo dobijemo ispis poruke u Consoli
			System.out.println("Deljenje nulom. ");
		}
		System.out.println("Program nastavlja sa izvrsenjem! ");  // ovo ce biti odstampano u Consoli // gore naleti na izuzetak, obradi ga i nastavlja dalje program da radi
	}

}

/*
 * Hijerarhija izuzetaka
 * 
 * Svi izuzeci izvedeni su iz klase Throwable.  // to je glavna, tj super klasa
 * Klasa Throwable ima dva direktna naslednika(potomka): Error i Exception.
 * 
 * Klasa Error opisuje fatalne greske.(greske na koje ne mozemo uticati).
 * Za greske tog tipa nije potrebno navoditi try/catch blokove.
 * 
 * Klasa Exception jeste klasa iz koje se izvode klase koje pripadaju 
 * neproverenim tipovima izuzetaka.
 * 
 * Exception {RuntimeException, IOException}  // IO = input output
 * 
 * RuntimeException {IndexOutOfBoundsException, ArithmeticException}
 */
