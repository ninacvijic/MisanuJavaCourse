package cvija;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		// uopstena(opsta) deklaracija kolekcije:
		// interfejs <T> ime = new ArrayList<T>();
		// T predstavlja tip promenljive
		
		List<Integer> kolekcijaAL = new ArrayList<Integer>();  // slika hijerarhije pdf-tu vidim da mi je interface List
		                                                       // Integer je omotacka klasa
		                                                       // obavezno Ctrl+Shift+O da odradi gore import!
		
		// add   // za dodavanje podataka(vrednosti) unutar kolekcije
	    // implementirana metoda add, nismo je mi implementirali, ona se vec nalazi u List-u, a mi je samo koristimo ovde
		kolekcijaAL.add(5);   // nazivKolekcije.add();
		kolekcijaAL.add(4);
		kolekcijaAL.add(9);
		kolekcijaAL.add(7);
		kolekcijaAL.add(12);
		
		System.out.println(kolekcijaAL); // ispisivanje elemenata koji se nalaze u zadatoj kolekciji

	}
	
	// profesorovo pitanje:
	// Razlika u odnosu na niz je: ________________?
	// Nizovi su staticki(znamo unapred broj elemenata niza), a ovde je dinamicki(moze se menjati br.elemenata,
	// npr.prvo otkucali 5,4,9,7 pa pustili pa onda dodali naknadno i 12).
	
	// Zakljucak: Koristite ArrayList kada ne znate unapred velicinu niza!
}
