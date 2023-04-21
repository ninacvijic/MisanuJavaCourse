package cvija;

import java.util.Map;
import java.util.TreeMap;

public class TM {  // TreeMap

	public static void main(String[] args) {
		
		// TreeMap je implementacija Map i SortedMap. Ova klasa održava red na svojim elementima. 
		// Održava uzlazni red.
		
		Map<Integer,String> vehicles = new TreeMap<>(); 
		
		vehicles.put(5,"BMW");  // put()
        vehicles.put(3,"Mercedes");
        vehicles.put(4,"Audi");
        vehicles.put(10,"Ford");
        
        System.out.println("Ukupan broj vozila: " + vehicles.size());  // size()
        
        for (Integer key : vehicles.keySet())    // prolazak kroz mapu  // keySet()
            System.out.println(key + " - " + vehicles.get(key));
        System.out.println();
 
        System.out.println("Najveci kljuc: " + ((TreeMap<Integer, String>) vehicles).lastKey());
        System.out.println("Najmanji kljuc: " + ((TreeMap<Integer, String>) vehicles).firstKey());
 
       System.out.println("\nTrenutno sva vozila na mapi:");
       for (String val : vehicles.values())
            System.out.println(val);
        System.out.println();
        
        vehicles.remove(5);  // remove() 
        vehicles.put(1,"Toyota");  // put()
		vehicles.put(66, "Golf");
		System.out.println("Stanje vozila na mapi nakon brisanja i dodavanja novih: ");
		for (Integer key : vehicles.keySet()) // prolazak kroz mapu
			System.out.println(key + " - " + vehicles.get(key));
		System.out.println();

		vehicles.clear(); // clear()
		System.out.println("Broj vozila nakon brisanja: " + vehicles.size());

	}

}
