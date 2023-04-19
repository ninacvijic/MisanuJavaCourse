package cvija;

public class finallyBlockWithException {
	
	// Through an exception out of method.
	static void procA() {
		try {
			System.out.println("Inside procA");  // proc = procedura/funkcija/metoda--pokazni primer
			throw new RuntimeException("demo");  // "mi" bacamo izuzetak!!!  // throws je u zaglavlju metode
			// throw koristi se za bacanje izuzetka u telu metode
		} finally {   // finally blok se izvrsava bez obzira da li je ili nije
			          // doslo do izuzetka
			System.out.println("procA finally");
		}
	}
	
	// Return from within a try block.
	static void procB() {
		try {
			System.out.println("Inside procB");
			return;  // break, continue, System.exit(0)  // nacini izlaska iz try bloka // bilo kako da izadjemo finally blok bice izvrsen!
		} finally {
			System.out.println("procB's finally");
		}
	}
	
   // Execute a try block normally.
	static void procC() {
		try {
			System.out.println("Inside procC");
		} finally {
			System.out.println("procC's finally");
		}
	}
}    // ako u ovom kodu zelimo da stavimo jos 1 throw new, ne moze biti istog tipa kao u metodi A !! (vazi li to samo za blok metode ili za celi kod???)

// throws se koristi u zaglavlju metode da naznaci tipove izuzetaka koje baca metoda
// throw se koristi za bacanje izuzetka u telu metode

// Blok finally se koristi zajedno sa blokom try kako bi se osiguralo 
// da se određeni deo koda izvršava bez obzira na to da li je izbačen izuzetak ili ne.
// Ovo je korisno za situacije u kojima želimo da budemo sigurni da su određeni resursi pravilno očišćeni ili zatvoreni, 
// čak i ako dođe do greške tokom izvršavanja programa.
