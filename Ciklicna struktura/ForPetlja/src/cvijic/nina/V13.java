package cvijic.nina;

import java.util.Scanner;

public class V13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Koliko brojeva zelite da unesete? ");
		int brojevi = input.nextInt();
		
		int zbir = 0;
		for (int i = 1; i <= brojevi; i++)   // i = i + 2 // svaki drugi broj
		{
			System.out.println("Unesite " + i + ". broj: ");
			int broj = input.nextInt();
			zbir = zbir + broj;
		}
		
		double aritmetickaSredina = zbir / brojevi;
		
		System.out.println("Aritmeticka sredina brojeva iznosi: " + aritmetickaSredina);
		
		input.close();
	}

}
