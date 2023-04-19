package cvijic.nina;

import java.util.Scanner;

public class Zad14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj redova: ");
		int n = sc.nextInt();

		System.out.print("Unesite broj kolona: ");
		int m = sc.nextInt();

		int a[][] = new int[n][m];
		
		System.out.println("Elementi matrice a: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("a[" + i + ", " + j + "]" + " = ");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elementi matrice a su: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Suma svih negativnih elemenata je: ");
		int s = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (a [i][j] < 0) {
					s = s + a[i][j];
			}
			}
		}
		System.out.print(s);
		sc.close();
	}

}
