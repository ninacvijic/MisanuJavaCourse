
// Prvi nacin: prelaskom pokazivaca misa preko naziva klase i importovanjem klase

package p2;

import p1.First;   // *

public class ImportPackage {
	
	public static void main(String[] args) {
		
		First f = new First(); // Kreiranje objekta klase iz paketa p1
		f.view();  // za dati objekat poziv funkcije.
	}

}
