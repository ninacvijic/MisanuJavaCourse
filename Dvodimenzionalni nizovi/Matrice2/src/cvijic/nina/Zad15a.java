package cvijic.nina;

import java.util.Scanner;

public class Zad15a {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite dimenzije matrice: ");
		int n = sc.nextInt();
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
		System.out.println("Aritmeticka sredina svih elemenata je: ");
		double s = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
					s = s + a[i][j];
			}
			}
		double As = s / (double)(n * m);
		System.out.println(As);
		sc.close();

	}

}
