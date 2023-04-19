package cvija;

public class Koren {

		public static void proveraBroja(double broj) throws Izuzetak {
			System.out.println("Provera broja: " + broj);
			
			if(broj<0)
				throw new Izuzetak(broj);
			
			System.out.println("Kvadratni koren broja " + broj + " iznosi: "  + Math.sqrt(broj));
			
		}
		
		
		public static void main(String[] args) {
		
			try {
				proveraBroja(25.0);
				System.out.println();
				proveraBroja(-5.0);
			} catch(Izuzetak e) {
				System.out.println("Izuzetak: " + e);
			}

	}

}
