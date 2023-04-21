package cvija;

import java.util.Hashtable;
import java.util.Map;

public class HT {  // HashTable

	public static void main(String[] args) {
		
		// HashTable ne dozvoljava null ključeve i vrijednosti!
		
		Map<Integer, String> vehicles = new Hashtable<>();

		vehicles.put(5, "BMW"); // put()
		vehicles.put(3, "Mercedes");
		vehicles.put(4, "Audi");
		vehicles.put(10, "Ford");

		System.out.println("Ukupan broj vozila: " + vehicles.size()); // size()
		
		for (Integer key : vehicles.keySet())    // prolazak kroz mapu  // keySet()
            System.out.println(key + " - " + vehicles.get(key));
        System.out.println();
        
        Integer searchKey = 4;      // containsKey()  
        if (vehicles.containsKey(searchKey))
            System.out.println("Na mapi se nalazi vozilo sa trazenim kljucem broj 4-Audi!");
        else
        	System.out.println("Na mapi se ne nalazi vozilo sa trazenim kljucem broj 4-Audi!");
        
        vehicles.clear(); // clear()
        System.out.println("Broj elemenata na mapi nakon brisanja: " + vehicles.size());
        
      //  vehicles.put(null,"Nissan");  // Sljedeće naredbe izbacuju NullPointerException
      //  vehicles.put(6,null);

	}

}
