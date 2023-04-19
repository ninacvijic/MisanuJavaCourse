package cvijic.nina;

import java.util.Scanner;

public class V4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("_______________________________________");
		System.out.println("Koliko brojeva zelite da saberete? ");
		int brojSabiraka = input.nextInt();
		
		int zbir = 0;
		for (int i = 1; i <= brojSabiraka; i++)
		{
			System.out.println("Unesite " + i + ". broj: ");
			int sabirak = input.nextInt();
			zbir = zbir + sabirak;
		}
		
		System.out.println("Zbir brojeva iznosi: " + zbir);
		
		input.close();
	}

}
