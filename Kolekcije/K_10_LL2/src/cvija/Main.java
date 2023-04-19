package cvija;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		String imena [] = {"Mika", "Zika", "Fica"};
		List<String> listaImena = new LinkedList<String>();
		for(String s : imena)
			listaImena.add(s);
		System.out.println("Prva lista: " + listaImena); 
		
		String imena1[] = {"Ana", "Lena", "Hana", "Una"};
		List<String> listaImena1 = new LinkedList<String>();
		for(String ime : imena1)
			listaImena1.add(ime);
		System.out.println("Druga lista: " + listaImena1);
		
		listaImena.addAll(listaImena1);  // **novo**// dodati jednoj listi cijelu drugu listu!!!
		System.out.println("Nova lista: " + listaImena);
		
		listaImena.subList(1, 4).clear(); // **novo** // brise index 1, ali ne brise 4  // [1-4) 
		                                   // prislonim mis ovde na rec sublist i izbaci mi opis funkcije
		System.out.println("Lista nakon uklanjanja imena na odredjenim pozicijama: " + listaImena);
		
		}

	}
// subList(indexFrom, indexTo);
// indexFrom - pocevsi od zadatog indeksa, ukljucujuci i njega
// indexTo - do zadatog indeksa, NE ukljucujuci i njega


