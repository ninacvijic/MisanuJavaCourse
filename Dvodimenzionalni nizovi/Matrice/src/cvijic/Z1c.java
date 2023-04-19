package cvijic;

import java.util.Scanner;

public class Z1c {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Broj redova: ");
		int red = sc.nextInt();

		System.out.println("Broj kolona: ");
		int kolona = sc.nextInt();

		int niz[][] = new int[red][kolona]; 

		System.out.println("Elementi matrice: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("a[" + i + ", " + j + "]" + " = ");
				niz[i][j] = sc.nextInt(); 
			}
		}
		System.out.println("Elementi dvodimenzionalnog niza su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Elementi druge kolone su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {  // promenljiva j sluzi za prolazak kroz "kolone"
				if (j == 1)  // Ispitivanje indeksa kolone dvodimenzionalnog niza
					System.out.print(niz[i][j] + " ");
			}
		}
		sc.close();
	}

}

