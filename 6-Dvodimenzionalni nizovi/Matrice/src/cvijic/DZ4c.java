package cvijic;

import java.util.Scanner;

public class DZ4c {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite dimenziju matrica n: ");
		int n = sc.nextInt();

		int a[][] = new int[n][n];   // A nxn
		int b[][] = new int[n][n];   // B nxn
		int c[][] = new int[n][n];

		System.out.println("Elementi prve matrice: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("a[" + i + ", " + j + "]" + " = ");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elementi druge matrice: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("b[" + i + ", " + j + "]" + " = ");
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elementi matrice a su: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Elementi matrice b su: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < n; i++) 
			for (int j = 0; j < n; j++) {
				c[i][j] = 0;
				for(int k = 0; k < n; k++) 
				c[i][j] = c[i][j] + a[i][k] * b[k][j];
			}

		System.out.println("Elementi matrice c (proizvod elemenata kvadratnih! matrica) su: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
