package cvija;

import java.util.Scanner;

public class Zadatak_1d {

	// dekadni u binarni

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite dekadni broj: ");
		int d = sc.nextInt();

		String b = Integer.toBinaryString(d);  // Integer.toBinaryString(n)
		System.out.println("Binarni broj je: " + b);

		sc.close();

	}

}
