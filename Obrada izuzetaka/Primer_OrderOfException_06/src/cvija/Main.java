package cvija;

public class Main {

	public static void main(String[] args) {
		
		try {
			int a = 0;
			int b = 10 / a;
		} catch(ArithmeticException e) {
			System.out.println("Izuzetak ");
	//	} catch(ArithmeticException e) {      // pokazuje nam gresku kada ovo ostavimo
	//		System.out.println("Izuzetak 1.");  // ne moze 2 puta "ArithmeticException e"
		}

	}

}
// Ukoliko postoji vise catch blokova ciji tip parametra odgovara
// tipu bacenog izuzetka, izvrsava se samo prvi takav catch blok.
// Greska je navesti 2 catch bloka sa istim tipom parametra.