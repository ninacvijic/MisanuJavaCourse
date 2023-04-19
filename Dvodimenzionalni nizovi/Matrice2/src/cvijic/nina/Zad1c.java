package cvijic.nina;

import java.util.Scanner;

public class Zad1c {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj redova: ");
		int red = sc.nextInt();

		System.out.print("Unesite broj kolona: ");
		int kolona = sc.nextInt();
		
		if (red <= 0 || kolona <= 0) {
			System.out.println("Pogresan unos. Probajte ponovo.");
		}
		else {

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
}