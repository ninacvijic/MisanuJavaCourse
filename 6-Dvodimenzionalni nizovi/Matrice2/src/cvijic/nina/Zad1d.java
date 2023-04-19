package cvijic.nina;

import java.util.Scanner;

public class Zad1d {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int kolona, red;

		do {
			System.out.print("Unesite broj redova: ");
			red = sc.nextInt();
			System.out.print("Unesite broj kolona: ");
			kolona = sc.nextInt();
		} while (red <= 0 || kolona <= 0);

		int matrica[][] = new int[red][kolona];

		System.out.println("Unesite elemente: ");

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("matrica[" + i + "," + j + "]" + "= ");
				matrica[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elementi dvodimenzionalnog niza su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
