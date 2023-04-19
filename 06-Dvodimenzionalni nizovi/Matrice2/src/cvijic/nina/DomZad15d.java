package cvijic.nina;

import java.util.Scanner;

public class DomZad15d {

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
		
		for (int j = 0; j < m; j++) {
			double sKolone = 0;
			int par = 0;
			for (int i = 0; i < n; i++) {
				if (a[i][j] % 2 == 0) {
					sKolone += a[i][j];
					par++;
			}
			}
			double As =  sKolone / (double) par;
			System.out.println("Aritmeticka sredina parnih elemenata " + (j+1) + ".kolone iznosi: " + As);
		}
		
		sc.close();	
	}

}
