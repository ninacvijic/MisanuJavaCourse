package cvija;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] brojevi = new int[5];   // staticki nizovi

		for(int i = 0; i < brojevi.length; i++) { // 0 .. 4 // ukupno 5 elemenata  // brojevi.length je max duzina naseg niza
			System.out.println("Unesite broj: ");
			brojevi[i] = scanner.nextInt();

			if ((i + 1) == brojevi.length) { // ispitujemo popunjenost niza  // ovo brojevi.length je u stvari ono n
				System.out.println("Niz je napunjen! ");
			}
		}

		System.out.println("Elementi niza su: "); // prolazak kroz sve elemente niza
		for(int i = 0; i < brojevi.length; i++) {
			System.out.println(brojevi[i]);
		}

		scanner.close();
	}

}
