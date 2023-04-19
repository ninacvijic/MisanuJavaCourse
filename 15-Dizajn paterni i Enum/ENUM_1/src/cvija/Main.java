package cvija;

/*Nabrajanje je lista imenovanih vrednosti koje definisu
 * nov tip podataka i njegove dozvoljene vrednosti.
 * To znaci da nabrajanje moze da sadrzi samo neku
 * od vrednosti koje su navedene na listi.
 * Druge vrednosti nisu dozvoljene.
 */

public class Main {

	public static void main(String[] args) {
		
	Boje b; // nema Boje b = new Boje(); !! vec samo kao prost tip!
	        // kao int a;  //**bitno, znaci nije objekat ili klasa!!!**
	b = Boje.Crvena; // klik na tacku i izlista se lista i biramo boju!
	                 // a ovo je kao ono pre a =5;  // damo vrednost podatku
	System.out.println("Boja: " + b);
	
	b = Boje.Plava; // promena vrednosti promenljivoj(kao u primeru Debugginga)
	                // mozemo izabrati samo boju iz liste!
	if(b == Boje.Plava) {   // ispitujemo da li je plava boja!
		System.out.println("Plava");
	}
	
	switch(b) {   // ispitivanje putem switch case 
	case Crvena:
		System.out.println("Crvena.");
		break;
	case Zelena:
		System.out.println("Zelena.");
		break;
	case Plava:
		System.out.println("Plava.");
		break;
	case Crna:
		System.out.println("Crna.");
		break;
	case Bela:
		System.out.println("Bela.");
		break;
	case Narandzasta:
		System.out.println("Narandzasta.");
		break;
	case Zuta:
		System.out.println("Zuta.");
		break;
	}
	
	}

}
