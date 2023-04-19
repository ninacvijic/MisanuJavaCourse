package cvija;

// 4. Kreirati program za unos vrednosti sa konzole, 
// smeštanje u kolkeciji ArrayList i ispisavanje smeštenih vrednosti.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> kolekcijaUplate = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);
		
		boolean unos = true;
		
		System.out.println("Za prekid unosa pritisnite -1 ! ");
		while(unos) {
			System.out.println("Novi iznos: ");
			int iznos = sc.nextInt();
			if(iznos == -1) {
				break;
			}
			kolekcijaUplate.add(iznos);	
		}
		
		System.out.println("Uplaceni iznosi (I nacin - unapredjena for petlja) : ");
		for(Integer in : kolekcijaUplate) {
			System.out.print(in + " ");
		}
		
		
		System.out.println("\nUplaceni iznosi (II nacin - standardna for petlja) : ");
		for(int i = 0; i < kolekcijaUplate.size(); i++) {
			System.out.print(kolekcijaUplate.get(i) + " ");
		}
		
		System.out.println("\nUplaceni iznosi (III nacin - pomocu iteratora) : ");
		Iterator<Integer> iter = kolekcijaUplate.iterator();
		while(iter.hasNext())
			System.out.print(iter.next() + " ");
		
		System.out.println("\nUplaceni iznosi (III nacin - pomocu List iteratora) : ");
		ListIterator<Integer> itr = kolekcijaUplate.listIterator();
		while(itr.hasNext())
			System.out.print(itr.next() + " ");
		
		System.out.println("\nUplaceni iznosi (IV nacin) : " + kolekcijaUplate);
		
		sc.close();

	}
	
}
