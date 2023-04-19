package cvijic;

import java.util.Scanner;

public class Z4b {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj redova: ");
		int red = sc.nextInt();

		System.out.print("Unesite broj kolona: ");
		int kolona = sc.nextInt();

		int a[][] = new int[red][kolona];
		int b[][] = new int[red][kolona];
		int c[][] = new int[red][kolona];

		System.out.println("Elementi prve matrice: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("a[" + i + ", " + j + "]" + " = ");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elementi druge matrice: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("b[" + i + ", " + j + "]" + " = ");
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elementi matrice a su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Elementi matrice b su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				c[i][j] = a[i][j] - b[i][j];
			}
		}
		System.out.println("Elementi matrice c (razlika elemenata matrica) su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
