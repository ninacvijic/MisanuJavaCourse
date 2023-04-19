package cvija;

import java.util.Scanner;

public class Main {
	
	// Napisati metodu za racunanje kolicnika razlomka:
	public static int kolicnik(int im, int br) { // imenilac i brojilac  // metoda
		return br / im;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite brojilac razlomka: ");
		int brojilac = sc.nextInt();
		System.out.println("Unesite imenilac razlomka: ");
		int imenilac = sc.nextInt();
		
		int rezultat = kolicnik(imenilac, brojilac);  // pozivanje metode
		System.out.println("Kolicnik iznosi: " + rezultat);

	}

}
