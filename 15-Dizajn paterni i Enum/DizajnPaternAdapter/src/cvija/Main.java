package cvija;

public class Main {
	
	static void testPatka(Patka patka) { 
		patka.kvace();
		patka.leti();
	}

	public static void main(String[] args) {
		// Test metoda sa zadnjeg slajda sa pdf!
		
		// DivljaCurka patka = new DivljaCurka();  // sto ovakvi objekti???  // prof pogresio ipak!
		DivljaPatka patka = new DivljaPatka();  
		Curka curka = new DivljaCurka();  // moze li ovde DivljaCurka ?
		
		// Umotavamo Curka u CurkaAdapter, zahvaljujuci kome ce izgledati kao Patka //ima izgled patke ali je u stavri curka
	    Patka curkaAdapter = new CurkaAdapter(curka); // ovo u zagradi znaci objekta curka
		
		
		System.out.println("Curka: ");  // sad cemo testirati Curku
		curka.curlice();
		curka.leti();
		
		// sad idemo iznad args - pravimo metodu da testiramo Patku
		//kad to uradimo vracamo se ovde
		
		System.out.println("Patka: ");
		testPatka(patka);
		
		// Pokusavamo da poturimo Curku kao Patku
		System.out.println("AdapterCurka");
		testPatka(curkaAdapter); // metoda ne zna da je dobila Curku prerusenu u Patku //izgleda kao patka a curlice
	}                             // 5x se ispisuje da leti, zbog one for petlje

}

// bune me ovi objekti!!!
// pitati Branka da pogleda!!!
