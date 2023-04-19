package cvijic.nina;

import java.util.Scanner;

public class V14a {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Koliko brojeva zelite da unesete? ");
		int brojevi = input.nextInt();
		
		int zbir = 0;
		int parni = 0;
		for (int i = 1; i <= brojevi; i++)
		{
			System.out.println("Unesite " + i + ".broj: ");
			int broj = input.nextInt();
			
			if (broj % 2 == 0)
			{
				parni++;
				zbir = zbir + broj;
			}
		}
		
		double aritmetickaSredina = (double) zbir /parni;
		
		System.out.println("Aritmeticka sredina parnih brojeva iznosi: " + aritmetickaSredina);
		
		input.close();


	}

}
