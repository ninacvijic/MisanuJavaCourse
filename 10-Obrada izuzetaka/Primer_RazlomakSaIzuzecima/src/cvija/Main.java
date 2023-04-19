package cvija;

import java.util.InputMismatchException;  // importovani izuzetak
import java.util.Scanner;

public class Main {
	
	// throws(kljucna rec) koristi se u zaglavlju metode
	// da naznaci tip/tipove izuzetaka koje ta metoda moze da "baci"
	public static int kolicnik(int im, int br) throws ArithmeticException {  // metoda  // znaci odmah prilikom pisanja metode navodimo do koje greske moze doci
		return br / im;                      // ovaj primer moze raditi i bez throws, ali ovo je cisto pokazno, da znamo!
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Unesite brojilac: ");
			int brojilac = sc.nextInt();
			System.out.println("Unesite imenilac: ");
			int imenilac = sc.nextInt();
			
			int rezultat = kolicnik(imenilac, brojilac);  // rizicna operacija - jedna
			System.out.println("Rezultat: " + rezultat);
			
		} catch (ArithmeticException e) {  // i ovde se navodi tip izuzetka
			System.out.println("Izuzetak. " + e);	
		} catch (InputMismatchException e) {   // *** dodali i ovo!  // kad npr.unesemo String umesto int  // poseban izuzetak // mora se importovati
			System.out.println("Unesite celobrojne vrednosti! ");
		}
		
	}

}
