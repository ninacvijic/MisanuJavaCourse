package nina.nina;

import java.util.Scanner;

public class Zad8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		int m;
		System.out.println("Unesite redni broj meseca od 1-12: ");
		m = input.nextInt();
		int g;
		System.out.println("Unesite godinu: ");
		g = input.nextInt();
		
		if (m == 1)
		{
			System.out.println("Januar = 31 dan");
		}
		else if (m == 2)
		{
			if (g % 4 == 0 && g % 100 != 0 || g % 400 == 0)
			{
				System.out.println("Februar = 29 dana");
			}
			else
			{
				System.out.println("Februar = 28 dana");
			}
		}
		else if (m == 3)
		{
			System.out.println("Mart = 31 dan");
		}
		else if (m == 4)
		{
			System.out.println("April = 30 dana");
		}
		else if (m == 5)
		{
			System.out.println("Maj = 31 dan");
		}
		else if (m == 6)
		{
			System.out.println("Jun = 30 dana");
		}
		else if (m == 7)
		{
			System.out.println("Jul = 31 dan");
		}
		else if (m == 8)
		{
			System.out.println("Avgust = 31 dan");
		}
		else if (m == 9)
		{
			System.out.println("Septembar = 30 dana");
		}
		else if (m == 10)
		{
			System.out.println("Oktobar = 31 dan");
		}
		else if (m == 11)
		{
			System.out.println("Novembar = 30 dana");
		}
		else if (m == 12)
		{
			System.out.println("Decembar = 31 dan");
		}
		else
		{
			System.out.println("Pogresan unos! ");
		}
		
		input.close();	
	}

}
