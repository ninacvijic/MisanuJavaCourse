package cvijic.nina;

import java.util.Scanner;

public class Zad1a {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj redova: ");
		int red = sc.nextInt();

		System.out.print("Unesite broj kolona: ");
		int kolona = sc.nextInt();

		int a[][] = new int[red][kolona];

		System.out.println("Elementi matrice: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("a[" + i + ", " + j + "]" + " = ");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elementi matrice su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Suma kvadrata elemenata dvodimenzionalnog niza je: ");
		int s = 0;
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				s = s + a[i][j] * a[i][j];
			}
		}
		System.out.println(s);
		sc.close();
	}

}
