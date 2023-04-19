package cvijic.nina;

import java.util.Scanner;

public class Zad15c {

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
		
		for (int i = 0; i < n; i++) {
			double S_Reda = 0;
			int p = 0;
			for (int j = 0; j < m; j++) {
				if (a[i][j] > 0 ) {
					S_Reda += a[i][j];
					p++;
			}
			}
			double As =  S_Reda / (double) p;
			System.out.println("Aritmeticka sredina pozitivnih elemenata " + (i+1) + ".reda iznosi: " + As);
		}
		
		sc.close();	
	}

}
