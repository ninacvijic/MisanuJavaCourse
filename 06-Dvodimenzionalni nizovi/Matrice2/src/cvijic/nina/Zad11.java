package cvijic.nina;

import java.util.Scanner;

public class Zad11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj redova: ");
		int red = sc.nextInt();

		System.out.print("Unesite broj kolona: ");
		int kolone = sc.nextInt();

		int X[][] = new int[red][kolone];
		
		System.out.println("Elementi matrice X: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				System.out.print("X[" + i + ", " + j + "]" + " = ");
				X[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elementi matrice X su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				System.out.print(X[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Suma elemenata treceg reda matrice X je: ");
		int s = 0;
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				if (i == 2) {
					s = s + X[i][j];
			}
			}
		}
		System.out.println(s);
		
		sc.close();

	}

}
