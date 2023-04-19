package cvijic.nina;

import java.util.Scanner;

public class Zad13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int red = 5;
		int kolone = 5;

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
		System.out.println("Suma svih clanova vecih od 3 je: ");
		int s = 0;
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				if (a[i][j] > 3) {
					s = s + a[i][j];
			}
			}
		}
		System.out.print(s);
		sc.close();
	}

}
