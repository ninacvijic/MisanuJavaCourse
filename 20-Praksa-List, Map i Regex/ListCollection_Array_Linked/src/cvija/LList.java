package cvija;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LList {

	public static void main(String[] args) {

		// LinkedList zbog dinamicnosti i lakoce umetanja i brisanja je pozeljnjija u odnosu na nizove.
		// vektor-par
		// razlika u odnosu na ArrayList

		List<String> ll = new LinkedList<String>();

		ll.add("Jabuka"); // add()
		ll.add("Banana");
		ll.add(2,"Kivi"); 
		ll.add(3,"Jagoda");
		ll.add("Tresnja");
		ll.add("Limun");
		System.out.println("Elementi povezane liste su: " + ll);
		
        ll.remove(0);  // remove()
        ll.remove("Banana");
        System.out.println("Povezana lista nakon brisanja elemenata: " + ll);
        
        System.out.println("Da li lista sadrzi Lubenicu?");
        boolean sadrzi = ll.contains("Lubenica");   // contains()
        if(sadrzi) {
        	System.out.println("Lista sadrzi Lubenicu.");
        	} else {
        	System.out.println("Lista ne sadrzi Lubenicu!");
        	}
        
        Object element = ll.get(3);  // pristupanje vrednosti elementa iz liste - get()
        System.out.println("Trazeno voce je: " + element);  
        
        ll.set(2, "Dinja");   // postavljanje vrednosti elementu - set()
        System.out.println("Povezana lista nakon promene: " + ll);
        
        ll.add("Nar");
        ll.add("Kajsija");
        ll.add("Breskva");
        System.out.println("Lista nakon ponovnog dodavanja: ");
        for (String s : ll) {     // prolazak kroz kolekciju
			System.out.printf("%s ", s);
		}
        
    	String vockice[] = {"Borovnica", "Malina", "Kupina"};
		List<String> voce = new LinkedList<String>();
		for(String v : vockice)
			voce.add(v);
		System.out.println("\nDruga lista: " + voce);
		
		ll.addAll(voce);  // addAll()
		System.out.println("Lista nastala spajanjem dve liste: " + ll);
		
		ll.subList(0, 2).clear(); // sublist().clear()                
		System.out.println("Lista nakon uklanjanja voca na odredjenim pozicijama: ");
		ListIterator<String> itr = ll.listIterator();  // iterator
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

	}

}
