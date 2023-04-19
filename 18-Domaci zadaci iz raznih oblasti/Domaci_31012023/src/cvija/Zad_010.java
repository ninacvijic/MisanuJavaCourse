package cvija;

import java.util.Scanner;

public class Zad_010 {

	// Napisati program koji omogućuje unos 10 brojeva unutar niza, traženog broja,
	// a zatim je potrebno ispisati koliko puta se traženi broj pojavljuje u nizu.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] a = new int[10];
		System.out.println("Unesite 10 proizvoljnih brojeva unutar niza: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = sc.nextInt();
		}

		System.out.println("Prikaz niza a: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();

		System.out.println("Unesite trazeni broj iz niza a: ");
		int br = sc.nextInt();
		sc.close();

		int brojac = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == br) {
				brojac++;
			}
		}

		System.out.println("Trazeni broj " + br + " se u nizu a ponavlja " + brojac + " puta.");
	}

}
