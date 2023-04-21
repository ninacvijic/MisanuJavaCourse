package cvija;

import java.util.*;

public class HM {  // HashMap

	public static void main(String[] args) {
		 /*
		  *  Interfejs Map implementiraju različite Java klase, kao što su HashMap(najcesce), HashTable i TreeMap.
		  *  HashMap ne održava nikakav red medju svojim elementima, a posebno ne garantuje da će red ostati konstantan tokom vremena.
		  *  Mapa preslikava kljuceve na vrijednosti.
		  *  Mapa ne dozvoljava duplikate ključeva(oni su jedinstveni), ali moze sadrzati duple vrijednosti. 
		  *  Mapa dozvoljava null ključeve i vrijednosti(sve klase osim HashTable).
		  *  Redosled mape je definisan kao redosled kojim se elementi mape vraćaju tokom iteracije.
		  *  HashMap je kao ArrayList, ali sa parovima(key-value).
		  */
		
		Map<Integer,String> vehicles = new HashMap<Integer,String>();  // 	Mapa ima oblik Map<K, V> 
		                                                               //   K-tip kljuca koji se nalazi u mapi, V-tip mapiranih vrijednosti
		
        vehicles.put(5,"BMW");  // dodavanje parova key/value metodom-put()
        vehicles.put(3,"Mercedes");
        vehicles.put(4,"Audi");
        vehicles.put(10,"Ford");
 
        System.out.println("Ukupan broj vozila: " + vehicles.size());  // size()
 
        for (Integer key : vehicles.keySet())    // prolazak kroz mapu  // keySet()-vraca skup koji sadrži sve kljuceve mape
            System.out.println(key + " - " + vehicles.get(key));
        System.out.println();
 
        Integer searchKey = 4;      // containsKey()  // vraca true ako mapa sadrzi trazeni kljuc
        if (vehicles.containsKey(searchKey))
            System.out.println("Na mapi se nalazi vozilo sa trazenim kljucem broj 4!");
        else
        	System.out.println("Na mapi se ne nalazi vozilo sa trazenim kljucem broj 4!");
        
        String searchValue = "Hyundai";      // containsValue()  // vraca true ako mapa sadrzi trazenu vrijednost
        if (vehicles.containsValue(searchValue))
            System.out.println("Na mapi se nalazi vozilo vrijednosti Hyundai!");
        else
        	System.out.println("Na mapi se ne nalazi vozilo vrijednosti Hyundai!");
        
     
        vehicles.remove(5);  // remove() - uklanja trazeni kljuc i njegovu vrijednost sa mape, ako kljuc postoji
        System.out.println("Sva vozila nakon uklanjana vozila sa kljucem broj 5:");
        System.out.println(vehicles);
        
        String v = vehicles.get(10); // get()
		System.out.println("Vozilo sa kljucem 10 na mapi je: " + v);
		
		vehicles.put(1,"Toyota");
		vehicles.put(66, "Golf");
		vehicles.put(null,"Nissan");  // dozvoljava null za key
	    vehicles.put(6,null);         //  dozvoljava null i za value
		System.out.println("Mapa nakon dodavanja novih vozila: ");
		for(Map.Entry<Integer, String> m : vehicles.entrySet()){   // entrySet()-vraca Set koji sadrzi sve elemente na mapi
			   System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println("Vozilo sa kljucem broj 3 je: ");
		String oldValue = vehicles.replace(3, "Fiat");  // replace()
		System.out.println(oldValue);
		System.out.println("Vozilo sa kljucem broj 3 nakon izmene je: ");
		System.out.println(vehicles.get(3));
		
		System.out.println("Trenutni sadrzaj mape:");
		Iterator<Integer> keyIterator = vehicles.keySet().iterator(); // prolazak kroz mapu // iterator
		while(keyIterator.hasNext()) {
			Integer nextKey = keyIterator.next();
			System.out.println(nextKey);
			System.out.println(vehicles.get(nextKey));
		}
        
		vehicles.clear(); // clear()-uklanja sve elemente sa mape
		System.out.println("Broj vozila na mapi nakon brisanja: " + vehicles.size());
		
		System.out.println("Da li je mapa prazna?");
		System.out.println(vehicles.isEmpty());  // isEmpty() // true/false
	}

}

