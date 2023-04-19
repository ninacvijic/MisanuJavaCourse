package cvija;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {   // U ovom primeru koristimo Iterator!!!

	public static void main(String[] args) {
		
		String imena[] = {"Mika", "Zika", "Ana", "Lana", "Hana", "Una"};  // pravimo niz
		
		List<String> listaImena = new ArrayList<String>();  // pravimo kolekciju  // ArrayList-dinamicki niz
		
		for(String ime : imena) // prolazimo kroz zadata imena, tj kroz niz
			listaImena.add(ime);  // moze npr slovo s umesto ime, svejedno, proizvoljan naziv
		
		String imenaZaBrisanje[] = {"Mika", "Lana", "Hana"};  // pravimo novi niz
		List<String> listaImenaZaBrisanje = new ArrayList<String>(); // pravimo novu kolekciju, za brisanje
		for(String ime : imenaZaBrisanje) // da prebacimo imena iz niza u kolekciju!!! zato koristimo isti parametar String ime
			listaImenaZaBrisanje.add(ime);
		
		// sada imamo 2 liste, listu imena i listu imena za brisanje
		
		// iterator  // da bismo ga koristili moramo uvesti odredjeni interfejs!!!
		
		// Kreiranje iteratora kolekcije i stampanje liste pomocu iteratora:   // obavezno Ctrl + Shift + O da importujemo
		Iterator<String> iter = listaImena.iterator();  // sintaksa // metoda uz pomoc koje se kreira iterator
		
		System.out.println("Stampanje elemenata pomocu iteratora: ");  // iterator nam omogucava da obidjemo nasu kolekciju
		while(iter.hasNext())  // hasNext() ispituje postoji li sl.element, ako postoji tj ako je true uzece sl.element
			System.out.print(iter.next() + " ");  // navodnike stavili cisto da razmak u ispisu  // a print je bez ln da bi bila imena u jednom redu!
		
		// Brisanje elemenata iz liste listaImena koji se nalaze u listi listaImenaZaBrisanje:
		iter = listaImena.iterator(); // oznacili smo listu imena
		//ispitivanje:
		while(iter.hasNext())
			if(listaImenaZaBrisanje.contains(iter.next()))  // uporedjivanje listi // ako sadrzi onda odraditi remove!
				iter.remove();                 // sa contains utvrdjujemo da li lista imena za brisanje sadrzi element na koji ukazuje iterator,
		                                       // ako je odgovor true, brisemo element.
		
		System.out.println("\nLista nakon brisanja: ");  // Moze se stampati preko: ( 4 nacina !!!)
                                                         // unapredjene for petlje,
		                                                 // standardne for petlje,
		                                                 // System.out.println-a 
		                                                 // i preko iteratora.  
		
		for(int i = 0; i < listaImena.size(); i++)  // standardna for petlja (ovde smo na taj nacin)-"peske" prolazimo kroz sve elemente liste
			System.out.print(listaImena.get(i) + " "); // " " -za razmak izmedju elemenata!   // get!
		
	}

}
