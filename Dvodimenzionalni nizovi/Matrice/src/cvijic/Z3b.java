package cvijic;

import java.util.Scanner;

public class Z3b {

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
		System.out.println("Elementi sa neparnim kolonama su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				// if (j % 2 != 0)  // indeks kolone
		      if ((j+1) % 2 != 0)  // kolona!
					System.out.print(niz[i][j] + " ");
			}
		}
		sc.close();
	}

}
