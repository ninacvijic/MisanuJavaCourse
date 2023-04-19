package cvija;

import java.util.Scanner;

public class Zadatak_1b {

	// Dekadni u binarni broj

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite dekadni broj: ");
		int d = sc.nextInt();

		int a = d; // cuvanje vrednosti unetog broja za kasnije ispisivanje-stampanje

		int x[] = new int[100]; // niz

		int brojac = 0; // inicijalziacija brojaca

		while (d > 0) { // popunjavanje niza 1 i 0
			x[brojac++] = d % 2;
			d = d / 2;
		}

		System.out.print("Za dekadni broj " + a + " binarni broj je: ");
		for (int i = brojac - 1; i >= 0; i--) {
			System.out.print(x[i]);
		}

		sc.close();
	}

}
