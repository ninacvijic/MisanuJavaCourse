package cvija;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		// pravljenje kolekcije sa Stringovnim tipom vrednosti:  // znaci dole sve pod " "
		List<String> kolekcija = new ArrayList<String>();
		
		// metode:  // koje cemo koristiti u ArrayList inace
		
		// size() - vraca broj elemenata smestenih u kolekciji ArrayList
		System.out.println("Pocetna duzina: " + kolekcija.size());  // naziv nase kolekcije + operator pristupa . + metoda size()
		
		// add() - dodaje element na kraj kolekcije
		kolekcija.add("Prvi");  // indeks 0 
		kolekcija.add("Drugi");  // 1
		kolekcija.add("Treci");   // 2
		kolekcija.add("Cetvrti");  // 3
		
		// prolazak kroz kolekciju:
		for(String s : kolekcija) {  // prolazak kroz elemente naseg niza  // s je proizvoljan naziv parametra
			System.out.printf("%s ", s);	                   // a kolekcija je naziv nase kolekcije koju smo gore kreirali
		}
		// %s je format za String, i printf
		// "%s " // potreban je razmak do zatvorenih navodnika da mi u Consoli bilo fino razdvojeno ispisano!
		
		//opet pozivamo metodu size:
		System.out.println("\nTrenutna duzina: " + kolekcija.size()); 
		
		// provera da li se neki zadati element nalazi unutar kolekcije
		// contains - logicka metoda, vraca true ako kolekcija sadrzi trazeni element, odnosno
		// vraca false ukoliko ne sadrzi trazeni element
		
		boolean sadrzi = kolekcija.contains("Treci"); // true ili false --mora biti boolean  // promenljivu smo nazvali sadrzi
		
		if(sadrzi) {  // unutar if-a navodimo uslov, nismo naveli striktni uslov npr < > ==, vec sadrzi == true - samo mi sad skraceno pisemo!
			          // if(sadrzi == true) je isto sto i if(sadrzi) // racuna se da je ovako zapisano true, samo je skracen zapis!!!
			System.out.println("Trazeni element se nalazi u zadatoj kolekciji!");
		}                                                        // "Treci" != "Treci   "  // paziti na razmake unutar " "
		else {
			System.out.println("Trazeni element se ne nalazi u zadatoj kolekciji!");
		}
		
		// sledeca metoda:
		// metoda get() - vraca element sa zadatim indeksom
		// indeksiranje ide od 0
		
		String element = kolekcija.get(2);  // indeks zadajemo u zagradi   // element je proizvoljan naziv promenljive
		System.out.println("Element sa indeksom 2 u kolekciji je: " + element);
		
		// metoda indexOf - vraca indeks prve pojave zadatog elementa kolekcije
		// vratice vrednost -1 ukoliko trazeni element ne postoji
		
		int pozicija = kolekcija.indexOf("Drugi");  // promenljiva pozicija, i u nju smestamo vrednost
		System.out.println("Element Drugi je na poziciji: " + pozicija);
		
		// toArray - sluzi za prebacivanje elemenata u niz  // kolekcija se pretvara u niz
		
		String[] nizString = new String[kolekcija.size()];  // kreiramo niz, nizovi su staticki, moramo znati koliki je niz, zato koristimo ovde metodu size()  // mora se poklapati po tipu i po velicini
		kolekcija.toArray(nizString); // konvertovana je nasa kolekcija u niz  // naziv Stringa(nizString) smo proizvoljno dali
		// prolazak kroz niz: 
		for(String s : nizString) {
			System.out.printf("%s ", s);  // %s - formatiranje Stringa
		}
		
		// remove - brise prvu pojavu zadate vrednosti
		kolekcija.remove("Treci");
		System.out.println("\nKolekcija nakon uklanjanja elementa Treci: ");  // da predjemo u novi red \n
		for(String s : kolekcija)  {  // moramo opet proci da vidimo da je izbrisano
			System.out.printf("%s ", s);
	}
	
	// clear - brise sve elemente iz zadate kolekcije
	kolekcija.clear();
	System.out.println("\nVelicina kolekcije nakon brisanja: " + kolekcija.size());  // pozivamo opet size da vidimo je li sve obrisano
	}
}
