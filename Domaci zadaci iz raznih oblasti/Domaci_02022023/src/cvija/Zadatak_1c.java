package cvija;

import java.util.Scanner;

public class Zadatak_1c {

	// Binarni u dekadni

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite binarni broj: ");
		String b = sc.nextLine();

		int d = Integer.parseInt(b, 2);  // Integer.parseInt(binaryString, x)
		System.out.println("Dekadni broj je: " + d);

		sc.close();

	}

}
