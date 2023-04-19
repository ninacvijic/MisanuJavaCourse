package cvija;

import java.util.Scanner;

public class Zadatak_1a_Zadano {

	// Napisati program koji pretvara binarni u dekadni broj.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite binarni broj: ");
		int b = sc.nextInt();

		int d = 0; // dekadni broj
		int a; // poslednja cifra
		int i = 0;  // brojac
		while (b > 0) {
			a = b % 10;
			d += a * Math.pow(2, i);

			b = b / 10;

			i++;
		}
		System.out.println("Za uneti binarni broj dekadni je: " + d);

		sc.close();
	}

}
