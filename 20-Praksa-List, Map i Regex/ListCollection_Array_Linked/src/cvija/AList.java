package cvija;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AList { 

	public static void main(String[] args) {
		/*
		 * Klase implementacije interfejsa List su ArrayList, LinkedList i Vector.
		 * ArrayList i LinkedList se siroko koriste, dok je klasa Vector zastarjela.
		 * List je uredjena sekvenca.
		 * List dozvoljava dupliranje elemenata.
		 * Elementima se moze pristupiti po njihovoj poziciji.
		 * 
		 * Klasa ArrayList koja je implementirana u okviru kolekcije pruza nam dinamicke nizove u Javi.
		 * Iako moze biti sporiji od standardnih nizova, ipak moze biti od pomoci u programima gdje je potrebno mnogo manipulacije nizom.
		 */

		List<String> kolekcija = new ArrayList<String>(); // pravljenje kolekcije

		System.out.println("Pocetna duzina kolekcije knjiga: " + kolekcija.size()); // size() - metoda

		kolekcija.add("Alhemicar"); // add()
		kolekcija.add("Zivotinjska farma");
		kolekcija.add("Lovac u zitu");
		kolekcija.add("Rat i mir");
		kolekcija.add("Klara i sunce");

		for (int i = 0; i < kolekcija.size(); i++) // prolazak kroz kolekciju
			System.out.print(kolekcija.get(i) + " ");

		System.out.println("\nTrenutna duzina kolekcije knjiga: " + kolekcija.size());

		kolekcija.add("Starac i more");
		kolekcija.add("Ana Karenjina");

		Iterator<String> iter = kolekcija.iterator();
		System.out.println("Kolekcija knjiga nakon dodavanja novih knjiga: "); // prolazak kroz kolekciju pomocu iteratora																
		while (iter.hasNext())
			System.out.print(iter.next() + " ");
		
        System.out.println("\nDa li se u kolekciji nalazi knjiga Tom?");
		boolean sadrzi = kolekcija.contains("Tom"); // contains()
		if (sadrzi) {
			System.out.println("Trazena knjiga se nalazi u zadatoj kolekciji!");
		} else {
			System.out.println("Trazena knjiga se ne nalazi u zadatoj kolekciji!");
		}

		String knjiga = kolekcija.get(2); // get()
		System.out.println("Knjiga sa indeksom 2 u kolekciji: " + knjiga);

		int pozicija = kolekcija.indexOf("Alhemicar"); // indexOf()
		System.out.println("Knjiga Alhemicar je na poziciji: " + pozicija);

		String[] nizString = new String[kolekcija.size()];
		kolekcija.toArray(nizString); // toArray()
		System.out.println("Trenutna duzina kolekcije knjiga: " + kolekcija.size());
		for (String s : nizString) { // prolazak kroz kolekciju
			System.out.printf("%s ", s);
		}

		kolekcija.remove("Rat i mir"); // remove()
		System.out.println("\nKolekcija knjiga nakon uklanjanja knjige Rat i mir: ");
		System.out.println(kolekcija);

		// kolekcija.clear(); // clear() - brise sve elemente iz kolekcije
		// System.out.println("\nVelicina kolekcije nakon brisanja: " + kolekcija.size()); }

	}

}

