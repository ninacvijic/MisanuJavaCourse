package cvija;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> ll = new LinkedList<String>(); // deklaracija!!!
		                                             // import ici preko one skracenice ili klik ovde na crvenu liniju ispod List i ici na import List
		
		// Metode u povezanoj listi:
		
		// Dodavanje elemenata u povezanoj listi:
		ll.add("A");  // 0 indeks
		ll.add("B");   // 1
		ll.add(2, "C");  //2  // *moze se i ovako dodati!  // pocnem kucati pa klik na Ctrl+Space i ponudi mi add(index, String)
		System.out.println("Elementi povezane liste su: " + ll);
		
		// Brisanje elementa iz povezane liste:
		ll.remove(0);  // brisanje preko indexa
		ll.remove("B"); // brisanje preko vrednosti
		System.out.println("Povezana lista nakon brisanja elemenata: " + ll);  // ll je naziv nase liste, tj kolekcije
		
		// dodavanje jos nekih elemenata
		ll.add("D");
		ll.add("E");
		ll.add("F");
		// Unutar interfejsa List, indeksiranje ide od 0.
		// (ne moze se indeksirati stringovnim tipom!) // ne moze se pisati npr na poziciju A da ide npr Nina !
		System.out.println("Elementi povezane liste su: " + ll);
		
		// Trazenje elemenata u povezanoj listi:
		boolean sadrzi = ll.contains("E");
		
		if(sadrzi) {
			System.out.println("Lista sadrzi element E.");
		} else {
			System.out.println("Lista ne sadrzi element E!");
			}
		
		// Pristupanje (uzimanje) vrednosti elementa iz povezane liste:
		Object element = ll.get(3); // *novo*!!! // Object je korenska klasa(superklasa) iz koje su izvedene sve ostale klase // ne mozemo pristupiti elementu preko [] kao i kod ArrayList!
		System.out.println("Zatrazen element je: " + element);      // preko Objecta pristupamo elementu!
		
		// Postavljanje vrednosti elementa u povezanoj listi:  // ovde ima set!
		ll.set(1, "Z");   // menjamo element sa indeksom 1 u Z
		System.out.println("Povezana lista nakon promene: " + ll);
		
		}
}
