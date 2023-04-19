package cvijic.nina;

import java.util.Scanner;

public class V10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a, b;
		System.out.println("Unesite pocetnu vrednost intervala: ");
		a = input.nextInt();
		System.out.println("Unesite krajnju vrednost intervala: ");
		b = input.nextInt();
		
		System.out.println("Brojevi unutar intervala deljivi sa brojem 3 su: ");
		
		for (int x = a; x <= b; x++)
		{
			if (x % 3 == 0)
			{
				System.out.println(x);
			}
			
		}
		
		input.close();
	}

}
