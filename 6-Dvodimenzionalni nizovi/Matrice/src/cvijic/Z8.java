package cvijic;

import java.util.Scanner;

public class Z8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj redova: ");
		int red = sc.nextInt();

		System.out.print("Unesite broj kolona: ");
		int kolone = sc.nextInt();

		int a[][] = new int[red][kolone];
		
		System.out.println("Elementi matrice a: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				System.out.print("a[" + i + ", " + j + "]" + " = ");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elementi matrice a su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Elementi transponovane matrice a su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				System.out.print(a[j][i] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
