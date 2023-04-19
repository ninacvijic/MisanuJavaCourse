package cvija;

public class Main {

	public static void main(String[] args) {

		Valjak v1 = new Valjak();
		Valjak v2 = new Valjak(3, 5);

		System.out.println("V1: " + v1.V()); // ovdje racuna V sa inicij.na 1  // konstruktor bez param.
		System.out.println("V2: " + v2.V()); // racuna sa 3 i 5
		
		System.out.println("r2: " + v2.getR());  // za obj v2, mogla sam i za v1 
		System.out.println("h2: " + v2.getH());
		
		System.out.println("P2: " + v2.P());
		
		System.out.println("Opis drugog valjka: " + v2.opis());
		

	}
}