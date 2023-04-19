package cvijic;

import java.util.Scanner;

public class Z3a {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj redova: ");
		int red = sc.nextInt();

		System.out.print("Unesite broj kolona: ");
		int kolona = sc.nextInt();

		int niz[][] = new int[red][kolona];

		System.out.println("Elementi matrice: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("niz[" + i + ", " + j + "]" + " = ");
				niz[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elementi matrice su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Elementi sa parnim indeksima redova su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				// if ( i % 2 == 0)  // indeks
				if ((i+1) % 2 == 0)  // red
					System.out.print(niz[i][j] + " ");
			}
		}
		// 1.red je neparan
		// 2.red je paran
		// 3.red je neparan
		// 4.red je paran
		
		// Razlika izmedju indeksa i reda:
		// matrica nema 0. red
		// matrica ima 0. indeks
		
		// 0. indeks matrice je oznaka za 1.red matrice
		// Mi vidimo elemente matrice (dok su indeksi u pozadini, ne vidimo ih)
		
		sc.close();
	}

}
