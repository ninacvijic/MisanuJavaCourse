package cvija;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

// 5. Kreirati program za unos vrednosti sa konzole, smeštanje u kolkeciji LinkedList
// ispisavanje smeštenih vrednosti. 

public class Main {

	public static void main(String[] args) {

		List<String> ll = new LinkedList<String>();

		Scanner sc = new Scanner(System.in);

		boolean unos = true;
		System.out.println("Za prekid unosa pritisnite Q ili q ! ");
		while (unos) {
			System.out.println("Novi unos: ");
			String ime = sc.nextLine();
			if (ime.equalsIgnoreCase("q")) {
				break;
			}
			ll.add(ime);
		}
		System.out.println("Imena na prvoj listi su: " + ll);
		
		ll.remove(0);
		System.out.print("Imena na drugoj listi : ");
		for(String s : ll) {
			System.out.printf("%s ", s);
		}
		
		ll.set(2, "Luka"); 
		System.out.print("\nImena na trecoj listi : ");
		for(int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		
		ll.add("Nina");
		System.out.print("\nImena na cetvrtoj listi : ");
		Iterator<String> iter = ll.iterator();
		while(iter.hasNext())
			System.out.print(iter.next() + " ");
		
		
		ll.remove(1);
		System.out.print("\nImena na petoj listi : ");
		ListIterator<String> itr = ll.listIterator();
		while(itr.hasNext())
			System.out.print(itr.next() + " ");
		
	sc.close();
		
		

	}

}
