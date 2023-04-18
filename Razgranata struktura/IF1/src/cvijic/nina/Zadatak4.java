package cvijic.nina;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

		// Ispitati da li je broj paran.

		Scanner input = new Scanner(System.in);

		int broj;
		System.out.println("Unesite broj: ");
		broj = input.nextInt();
		
		if (broj % 2 ==0)
		{
			System.out.println("Broj je paran.");
		}
		else {
		System.out.println("Broj je neparan!");
		}
		input.close();

	}

}
