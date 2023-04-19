package cvija;

import java.util.Scanner;

public class Zad_9 {

	// Napisati program koji prebrojava “space” simbole.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite zeljeni tekst: ");
		String s = sc.nextLine();

		int brojac = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ')
				brojac++;
		}
		System.out.println("Broj space simbola u datom tekstu iznosi: " + brojac);
		sc.close();
	}

}
