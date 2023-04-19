package cvija;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ALBrojevi {
	
	Scanner sc = new Scanner(System.in);
	
	List<Integer> brojevi = new ArrayList<Integer>();  // ArrayList-a je dinamicka lista, mogu se ponavljati elementi
	
	void unosBrojeva() {   // metoda
		System.out.println("Za prekid unosenja, unesite -1: ");
		while(true) {
			System.out.print("Broj: ");
			int num = sc.nextInt();
			if(num == -1) {
				return;
			}
			// smestanje ucitanih vrednosti sa konzole u kolekciju:
			this.brojevi.add(num);	  // **novo**  // kaze prof najbitnije je ovo sa this!
		}
	}
		
		void ispisBrojeva() {  // druga metoda u pomocnoj klasi
			System.out.println(this.brojevi);	
	}

}
