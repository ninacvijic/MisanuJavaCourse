package cvijic.nina;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		// Za uneti broj ispitati da li je deljiv brojem 2 i brojem 3.

		Scanner input = new Scanner(System.in);

		// 1. Ulazne vrednosti

		int x;
		System.out.println("Unesite broj x: "); // nije neophodna linija koda
		x = input.nextInt();

		// 2. Obrada podatka

		if (x % 2 == 0 && x % 3 == 0) 
		{
			System.out.println("Uneti broj je deljiv i sa brojem 2 i sa brojem 3.");
		}

		input.close();
	}

}
