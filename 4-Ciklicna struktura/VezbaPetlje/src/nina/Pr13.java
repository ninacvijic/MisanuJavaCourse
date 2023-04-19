package nina;

import java.util.Scanner;

public class Pr13 {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite vrednost za a:");
		int a = ulaz.nextInt();
		
		int suma = 0;
		
		while (a != 5) {
			
			if (a % 2 == 0 || a % 7 == 0)
				suma += a;
			
			System.out.println("Unesite vrednost za a:");
			a = ulaz.nextInt();
		}
		
		System.out.println("Zbir učitanih brojeva koji su deljivi sa 2 ili 7 je " + suma);
		ulaz.close();
	}

}
