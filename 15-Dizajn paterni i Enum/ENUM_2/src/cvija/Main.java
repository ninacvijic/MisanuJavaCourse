package cvija;

public class Main {

	public static void main(String[] args) {
		
		/* Sva nabrajanja imaju 2 unapred definisane metode:
		 * values() - vraca niz koji sadrzi listu konstanti definisanih u nabrajanju
		 * valuesOf() - vraca konstantu iz nabrajanja cija vrednost odgovara 
		 * znakovnom nizu prosledjenom u argumentu.
		 */
		
		Boja b;  // nismo ovo iskoristili u ovom primeru, a mogla kao u prethodnom
		System.out.println("Boje: ");
		
		Boja nizBoja[] = Boja.values();  // pravimo niz! ima uglaste zagrade,  a vrednosti su mu Boja.values() !!! //*novo*
		for(Boja c : nizBoja) {  // ne da nam b da koristimo, pa promeniti u bilo koje drugo slovo! (uzeli c kao color)
			System.out.println(c + " ");
		}
		
		Boja c1;
		c1 = Boja.valueOf("Bela");// vraca vrednost iz nabrajanja koja odgovara imenu zadate konstante
		System.out.println("Boja: " + c1);
		// kada je upisao umesto "Bela" u valuesOf "asdasd"
		// ili kada je upisao bela malim slovom
		//javlja Exception u Consoli!
		//kaze da je exception u enumu
	}

}
