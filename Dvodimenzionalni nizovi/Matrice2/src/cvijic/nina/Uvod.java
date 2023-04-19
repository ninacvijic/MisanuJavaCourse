package cvijic.nina;

import java.util.Scanner;

public class Uvod {

	public static void main(String[] args) {

		// Ucitavanje podataka

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj redova: ");
		int red = sc.nextInt();

		System.out.print("Unesite broj kolona: ");
		int kolona = sc.nextInt();

         // "matrica" = naziv naseg dvodimenzionalnog niza
		int matrica [][] = new int [red][kolona];
		
		System.out.println("Unesite elemente: ");
		
		for(int i = 0; i < red; i++) {
			for(int j = 0; j < kolona; j++) {
				System.out.print("matrica[" + i + "," + j + "]"+ "= ");
				matrica[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Elementi dvodimenzionalnog niza su: ");
		for(int i = 0; i < red; i++) {
			for(int j = 0; j < kolona; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
