package cvija;

public class Zad_3 {

	// Napisati program koji ispisuje sve proste brojeve od 1 do 10.
	// Prost broj je deljiv samo jedinicom i samim sobom.

	public static void main(String[] args) {

		System.out.println("Prosti brojevi od 1 do 10: ");
		for (int i = 2; i <= 10; i++) { // krece se od 2, jer 0 i 1 nisu prosti brojevi
			boolean prostBr = true;        // 2 je jedini prost paran broj, zato sto su svi drugi parni 
			for (int j = 2; j < i; j++) {   // brojevi deljivi sa 2.
				if (i % j == 0 && i % i == 0) { // Broj nije prost.
					prostBr = false;
					break;
				}
			}
			if (prostBr) {
				System.out.println(i + "   ");
			}

		}

	}
}